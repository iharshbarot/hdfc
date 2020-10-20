package com.util;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class RSAEncrypterDecrypter {
	private static final String FILEPATH_PUBLICKEY = "C:\\UIDAI\\Keys\\uidai_auth_prod.cer";
	private static final String RSA_ECB_PKCS1PADDING = "RSA/ECB/PKCS1Padding";
	private static final String JCE_PROVIDER = "BC";
	private static final String CERTIFICATE_TYPE = "X.509";

	/**
	 * Encrypt data using RSA/ECB/PKCS1Padding
	 * 
	 * @param data   to be encrypted
	 * @param public key used for encryption
	 * @return encrypted result
	 */
	@SuppressWarnings("resource")
	public static byte[] encrypt(byte[] data) {
		



		FileInputStream fileInputStream = null;
		CertificateFactory certFactory;
		try {
			certFactory = CertificateFactory.getInstance(CERTIFICATE_TYPE, JCE_PROVIDER);
			fileInputStream = new FileInputStream(new File(FILEPATH_PUBLICKEY));
			X509Certificate cert = (X509Certificate) certFactory.generateCertificate(fileInputStream);
			PublicKey publicKey = cert.getPublicKey();
			
			Cipher pkCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", "BC");
			pkCipher.init(1, publicKey);
			byte[] encSessionKey = pkCipher.doFinal(data);
			return encSessionKey;
		} catch (InvalidKeyException | IllegalBlockSizeException | BadPaddingException | NoSuchAlgorithmException
				| NoSuchPaddingException  | CertificateException | NoSuchProviderException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * Decrypt data using RSA/ECB/PKCS1Padding
	 * 
	 * @param data    to be decrypted
	 * @param private key used for decryption
	 * @return decrypted result
	 */
	public byte[] decrypt(byte[] data, PrivateKey key) {
		byte[] decryptedValue = null;
		try {
			Cipher cipher = Cipher.getInstance(RSA_ECB_PKCS1PADDING);
			cipher.init(Cipher.DECRYPT_MODE, key);
			decryptedValue = cipher.doFinal(data);
		} catch (NoSuchAlgorithmException exp) {
			// TODO handle exception
			exp.printStackTrace();
		} catch (NoSuchPaddingException exp) {
			// TODO handle exception
			exp.printStackTrace();
		} catch (IllegalBlockSizeException exp) {
			// TODO handle exception
			exp.printStackTrace();
		} catch (BadPaddingException exp) {
			// TODO handle exception
			exp.printStackTrace();
		} catch (InvalidKeyException exp) {
			// TODO handle exception
			exp.printStackTrace();
		}
		return decryptedValue;
	}

}
