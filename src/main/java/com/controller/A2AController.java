package com.controller;

import java.time.LocalTime;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.RequestJason;
import com.model.RequestXML;
import com.util.AESEncrypterDecrypter;
import com.util.JAXBHelper;
import com.util.KeyGenerator;
import com.util.SignatureUtil;
import com.util.Validator;
import com.util.XMLBuilder;

import org.springframework.http.MediaType;

import static java.time.temporal.ChronoUnit.MILLIS;

import java.text.ParseException;

@SpringBootApplication
@RestController
@RequestMapping("/auth")
public class A2AController {

	@GetMapping(value = "/checkstatus", produces = { MediaType.APPLICATION_XML_VALUE })
	public String checkAUAStatus() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><status>Corporate Payment A2A is UP</status>";
	}

	@PostMapping(value = "/paymentreq/{paymentmode}", produces = { MediaType.APPLICATION_XML_VALUE })
	public String acceptRequest25(@RequestBody String requestXML, @PathVariable("paymentmode") String paymentmode,
			HttpServletRequest httpRequest) throws JAXBException, ParseException {
		return processAndBuildResponse(requestXML, httpRequest,paymentmode);
	}

	private String processAndBuildResponse(String requestXML, HttpServletRequest httpRequest, String paymentmode)
			throws JAXBException, ParseException {

		RequestJason requestJason = new RequestJason();
		RequestXML request;
		LocalTime refTime = LocalTime.now();
		print(System.lineSeparator() + "Entered A2A :", refTime);

		/**
		 * 1. Parse Request XML for Different payment method
		 */
		switch (paymentmode) {
		case "A2A": {
			request = JAXBHelper.convertToObject(requestXML, RequestXML.class);
			if (request == null) {

			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + paymentmode);
		}
		print("Parse Complete:", refTime);

		/**
		 * 2. Validation
		 */
		String validationError = Validator.Validate(request);
		if (!validationError.equals("")) {

		}
		print("Validation Complete:", refTime);

		/**
		 * 3. Generate The original REST-XML
		 * The request needs to be wrapped inside the tags
		 * <request></request> along with original request XML 
		 * 
		 * @return Original request XML
		 */
		String xml = XMLBuilder.hdfcRequest(request);
		print("Ganerate Bank Request Complete:", refTime);

		/**
		 * 4.1 RequestSignatureEncryptedValue. 
		 * 4.1.A. Steps for creating digital signature of the request and the XML signature payload generated using RSA
		 * SHA-256 algorithm and partner’s private key for signing (This will be
		 * verified by the Bank using Partner’s public certificate provided).
		 * 
		 * @return Digitally signed Original request XML
		 */
		String signedXML = SignatureUtil.signXML(xml);
		if (signedXML.equals("")) {

		}
		print("Sign XML Complete:", refTime);

		/**
		 * 4.1.B. Generate Random key Generate a random string of 32 bytes (256 bits)
		 * which will be utilized as a Symmetric key for encryption of the result of
		 * step 1 A).
		 * 
		 * @return Random Key
		 */
		String randomKey = KeyGenerator.generateAlphaNumericKey(32);

		/**
		 * 4.1.C. Base64 encode signedXML
		 * 
		 * @return encoded signedXML
		 */
		String encodedSignXML = Base64.getEncoder().encodeToString(signedXML.getBytes());

		/**
		 * 4.1.D. Steps for encrypting the digital signature value
		 * 
		 * @return encoded Encrypted Signature Value
		 */
		byte[] encyptedXML = AESEncrypterDecrypter.encrypt(encodedSignXML, randomKey.getBytes());
		requestJason.setRequestSignatureEncryptedValue(Base64.getEncoder().encodeToString(encyptedXML));
		
		/**
		 * 4.2. SymmetricKeyEncryptedValue
		 * 4.2.A External partner needs to base64 encode the Key which
		// is the 32 bytes random string generated in step 4.1.B
		 * @return encoded signedXML
		 */
		String encodedRandomKey = Base64.getEncoder().encodeToString(randomKey.getBytes());

		return signedXML;
	}

	private void print(String message, LocalTime refTime) {
		// TODO: remove after testing is done
		System.out.println(message + (refTime.until(LocalTime.now(), MILLIS)));
	}

}
