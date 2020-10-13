package com.util;

import java.io.StringReader;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import com.model.Debit;
import com.model.Header;
import com.model.RequestXML;
import com.model.Summary;

public class ParseUtil {

	public static RequestXML parseA2AXML(String xml) {
		RequestXML request = new RequestXML();
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		xmlInputFactory.setProperty(XMLInputFactory.IS_COALESCING, Boolean.TRUE);
		StringReader reader = new StringReader(xml);
		XMLEvent xmlEvent;
		String parent = "";
		request.header = new Header();
		request.summary = new Summary();
		request.debit = new Debit();
		try {
			XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(reader);
			while (xmlEventReader.hasNext()) {
				xmlEvent = xmlEventReader.nextEvent();
				if (xmlEvent.isStartElement()) {
					StartElement startElement = xmlEvent.asStartElement();
					switch (startElement.getName().getLocalPart()) {

					// ******************** 1. Parse Header **********************
					case "extsysname": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.header.setExtsysname(xmlEvent.asCharacters().getData());
						}
						break;
					}
					case "datpost": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.header.setDatpost(xmlEvent.asCharacters().getData());
						}
						break;
					}

					case "batchnumext": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.header.setBatchnumext(xmlEvent.asCharacters().getData());
						}
						break;
					}

					case "idtxn": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.header.setIdtxn(xmlEvent.asCharacters().getData());
						}
						break;
					}

					case "codcurr": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.header.setCodcurr(xmlEvent.asCharacters().getData());
						}
						break;
					}

					case "iduser": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.header.setIduser(xmlEvent.asCharacters().getData());
						}
						break;
					}

					case "idcust": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.header.setIdcust(xmlEvent.asCharacters().getData());
						}
						break;
					}

					case "groupid": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.header.setGroupid(xmlEvent.asCharacters().getData());
						}
						break;
					}

					case "reqdatetime": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.header.setReqdatetime(xmlEvent.asCharacters().getData());
						}
						break;
					}

					// ******************** 2. Parse Summary **********************

					case "orgcountdr": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.summary.setOrgcountdr(Short.parseShort(xmlEvent.asCharacters().getData()));
						}
						break;
					}

					case "orgcountcr": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.summary.setOrgcountcr(Short.parseShort(xmlEvent.asCharacters().getData()));
						}
						break;
					}

					case "orgsumdr": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.summary.setOrgsumdr(Float.parseFloat(xmlEvent.asCharacters().getData()));
						}
						break;
					}

					case "orgsumcr": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.summary.setOrgsumcr(Float.parseFloat(xmlEvent.asCharacters().getData()));
						}
						break;
					}

					// ******************** 3. Parse Parent Node Value **********************

					case "debit": {
						xmlEvent = xmlEventReader.nextEvent();
						parent = "debit";
						break;
					}

					case "credit": {
						xmlEvent = xmlEventReader.nextEvent();
						parent = "credit";
						break;
					}

					// ******************** 4. Parse Debit *******************************

					case "stanext": {
						xmlEvent = xmlEventReader.nextEvent();
						switch (parent) {
						case "debit": {
							if (xmlEvent.isCharacters()) {
								request.debit.setStanext(xmlEvent.asCharacters().getData());
							}
							break;
						}
						case "credit": {
							if (xmlEvent.isCharacters()) {
								request.cridit.setStanext(xmlEvent.asCharacters().getData());
							}
							break;
						}
						
						}
						break;
					}

					case "accountno": {
						xmlEvent = xmlEventReader.nextEvent();
						switch (parent) {
						case "debit": {
							if (xmlEvent.isCharacters()) {
								request.debit.setAccountno(xmlEvent.asCharacters().getData());
							}
							break;
						}
						case "credit": {
							if (xmlEvent.isCharacters()) {
								request.cridit.setAccountno(xmlEvent.asCharacters().getData());
							}
							break;
						}
						
						}

						break;
					}

					case "orgamount": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.debit.setOrgamount(Float.parseFloat(xmlEvent.asCharacters().getData()));
						}
						break;
					}
					
					case "txndesc": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.debit.setTxndesc(xmlEvent.asCharacters().getData());
						}
						break;
					}
					
					case "referenceno": {
						xmlEvent = xmlEventReader.nextEvent();
						if (xmlEvent.isCharacters()) {
							request.debit.setReferenceno(xmlEvent.asCharacters().getData());
						}
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
