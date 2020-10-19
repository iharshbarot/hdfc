package com.util;

import javax.xml.bind.JAXBException;

import com.model.RequestPMPS;
import com.model.RequestRTGS;
import com.model.RequestXML;

public class Opration {

	public static String xmlPerformace(String requestXML, String paymentMode) {

		switch (paymentMode) {
		case "A2A": {

			try {
				RequestXML request = JAXBHelper.convertToObject(requestXML, RequestXML.class);
				if (request == null) {
					return "Error in Parsing XML";
				}

				String originalXML = XMLBuilder.hdfcRequest(request);
				return originalXML;
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

		}
		case "IMPS": {

			try {
				RequestPMPS request = JAXBHelper.convertToObject(requestXML, RequestPMPS.class);
				if (request == null) {
					return "Error in Parsing XML";
				}
				String originalXML = XMLBuilder.IMPS(request);
				return originalXML;
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}

		case "RTGS": {

			try {
				RequestRTGS request = JAXBHelper.convertToObject(requestXML, RequestRTGS.class);
				if (request == null) {
					return "Error in Parsing XML";
				}
				//String originalXML = XMLBuilder.RTGS(request);
				String originalXML = JAXBHelper.convertToXML(request, RequestRTGS.class);
				return originalXML;
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + paymentMode);
		}

	}

}
