package com.util;

import java.io.StringReader;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import com.model.RequestXML;

public class ParseUtil {

	public static RequestXML parseA2AXML(String xml) {
		RequestXML request = new RequestXML();
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		xmlInputFactory.setProperty(XMLInputFactory.IS_COALESCING, Boolean.TRUE);
		StringReader reader = new StringReader(xml);
		XMLEvent xmlEvent;

		try {
			XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(reader);
			while (xmlEventReader.hasNext()) {
				xmlEvent = xmlEventReader.nextEvent();
				if (xmlEvent.isStartElement()) {
					StartElement startElement = xmlEvent.asStartElement();
					switch (startElement.getName().getLocalPart()) {
					case "header": {
					
						
						break;
					}
					}

				}
			}
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return request;

	}

}
