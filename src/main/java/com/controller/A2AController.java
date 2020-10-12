package com.controller;

import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.RequestXML;
import com.util.ParseUtil;
import com.util.XMLBuilder;

import org.springframework.http.MediaType;

import static java.time.temporal.ChronoUnit.MILLIS;

@SpringBootApplication
@RestController
@RequestMapping("/auth/A2A")
public class A2AController {

	@GetMapping(value = "/checkstaus", produces = { MediaType.APPLICATION_XML_VALUE })
	public String checkAUAStatus() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><status>Corporate Payment A2A is UP</status>";
	}

	@PostMapping(value = "/paymentreq", produces = { MediaType.APPLICATION_XML_VALUE })
	public String acceptRequest25(@RequestBody String requestXML, HttpServletRequest httpRequest) {
		return processAndBuildResponse(requestXML, httpRequest);
	}

	private String processAndBuildResponse(String requestXML, HttpServletRequest httpRequest) {

		LocalTime refTime = LocalTime.now();
		print(System.lineSeparator() + "Entered A2A :", refTime);

		// ******************** 1. Parse the XML to Object**********************
		RequestXML request = ParseUtil.parseA2AXML(requestXML);
		if (request == null) {
			System.out.println("parse is null");
			return "null";
		}
		print("Parse Complete:", refTime);
		
		// ******************** 2. Generate Bank Request**********************
		String xml = XMLBuilder.hdfcRequest(request);
		print("Ganerate Bank Request Complete:", refTime);
		

		return xml;
	}

	private void print(String message, LocalTime refTime) {
		// TODO: remove after testing is done
		System.out.println(message + (refTime.until(LocalTime.now(), MILLIS)));
	}

}
