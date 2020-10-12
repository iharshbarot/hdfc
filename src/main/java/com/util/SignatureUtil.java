package com.util;

import java.io.FileInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class SignatureUtil {

	public static CertificateFactory certFactory;
	private static final char[] PASSWORD = "i@n!9$qc".toCharArray();
	private static final String ALIAS = "le-089c9a5e-bc55-4000-824a-f643be92d082";
	private static final String FILEPATH_PRIVATEKEY = "C:\\UIDAI\\Keys\\DST_GUJ_SPC_private_key.pfx";
	private static final Boolean INCLUDEKEYINFO = true;
	private static final String WHOLE_DOC_URI = "";

	public static String signXML(String xml) {
		try {
			Security.addProvider(new BouncyCastleProvider());
			X509Certificate x509Cert;
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			XMLSignatureFactory FAC = XMLSignatureFactory.getInstance("DOM");
			KeyStore ks = KeyStore.getInstance("PKCS12");
			FileInputStream keyFileStream = new FileInputStream(FILEPATH_PRIVATEKEY);
			ks.load(keyFileStream, PASSWORD);
			KeyStore.PrivateKeyEntry KEYENTRY = (KeyStore.PrivateKeyEntry) ks.getEntry(ALIAS,
					new KeyStore.PasswordProtection(PASSWORD));
			Reference ref = FAC.newReference(WHOLE_DOC_URI, FAC.newDigestMethod(DigestMethod.SHA1, null),
					Collections.singletonList(FAC.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null)),
					null, null);
			SignedInfo sInfo = FAC.newSignedInfo(
					FAC.newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE, (C14NMethodParameterSpec) null),
					FAC.newSignatureMethod(SignatureMethod.RSA_SHA1, null), Collections.singletonList(ref));
			KeyInfoFactory kif = FAC.getKeyInfoFactory();
			x509Cert = (X509Certificate) KEYENTRY.getCertificate();
			List x509Content = new ArrayList();
			x509Content.add(x509Cert.getSubjectX500Principal().getName());
			x509Content.add(x509Cert);
			X509Data xd = kif.newX509Data(x509Content);
			KeyInfo kInfo = kif.newKeyInfo(Collections.singletonList(xd));
			Transformer trans = TransformerFactory.newInstance().newTransformer();
			StringWriter stringWriter = new StringWriter();
			Document xmlDocument = dbf.newDocumentBuilder().parse(new InputSource(new StringReader(xml)));
			DOMSignContext dsc = new DOMSignContext(KEYENTRY.getPrivateKey(), xmlDocument.getDocumentElement());
			XMLSignature signature = FAC.newXMLSignature(sInfo, INCLUDEKEYINFO ? kInfo : null);
			signature.sign(dsc);
			Node node = dsc.getParent();
			Document signedDocument = node.getOwnerDocument();
			trans.transform(new DOMSource(signedDocument), new StreamResult(stringWriter));
			return stringWriter.getBuffer().toString();
		} catch (Exception e) {
			return "";
		}

	}

}
