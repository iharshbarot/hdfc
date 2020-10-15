package com.controller;

import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.RequestXML;
import com.util.JAXBHelper;
import com.util.SignatureUtil;
import com.util.Validator;
import com.util.XMLBuilder;

import org.springframework.http.MediaType;

import static java.time.temporal.ChronoUnit.MILLIS;

import java.text.ParseException;

@SpringBootApplication
@RestController
@RequestMapping("/auth/A2A")
public class A2AController {

	@GetMapping(value = "/checkstaus", produces = { MediaType.APPLICATION_XML_VALUE })
	public String checkAUAStatus() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><status>Corporate Payment A2A is UP</status>";
	}

	@PostMapping(value = "/paymentreq", produces = { MediaType.APPLICATION_XML_VALUE })
	public String acceptRequest25(@RequestBody String requestXML, HttpServletRequest httpRequest)
			throws JAXBException, ParseException {
		return processAndBuildResponse(requestXML, httpRequest);
	}

	private String processAndBuildResponse(String requestXML, HttpServletRequest httpRequest)
			throws JAXBException, ParseException {

		LocalTime refTime = LocalTime.now();
		print(System.lineSeparator() + "Entered A2A :", refTime);

		// ******************** 1. Parse the XML to Object**********************
		RequestXML request = JAXBHelper.convertToObject(requestXML, RequestXML.class);

		print("Parse Complete:", refTime);

		String validationError = Validator.Validate(request);
		if (!validationError.equals("")) {
		}
		print("Validation Complete:", refTime);

		// ******************** 2. Generate Bank Request**********************
		// String xml = JAXBHelper.convertToXML(requestXml, Request.class);
		String xml = XMLBuilder.hdfcRequest(request);
		print("Ganerate Bank Request Complete:", refTime);

		// ******************** 3. Sign XML ************************************
		String signedXML = SignatureUtil.signXML(xml);
		if (signedXML.equals("")) {

		}

		// ******************** 4. Sign XML ************************************
		
		
		print("Sign XML Complete, Sending to ASA :", refTime);

		return signedXML;
	}

	private void print(String message, LocalTime refTime) {
		// TODO: remove after testing is done
		System.out.println(message + (refTime.until(LocalTime.now(), MILLIS)));
	}

}
