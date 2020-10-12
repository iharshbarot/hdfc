package com.util;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.model.RequestXML;

public class XMLBuilder {

	public static String hdfcRequest(RequestXML request) {

		try {
			StringWriter stringWriter = new StringWriter();

			XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
			XMLStreamWriter xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);
			xMLStreamWriter.writeStartDocument("UTF-8", "1.0");
			xMLStreamWriter.writeStartElement("request");
			
			xMLStreamWriter.writeStartElement("faxml");
			
			xMLStreamWriter.writeStartElement("header");
			xMLStreamWriter.writeStartElement("extsysname");
			xMLStreamWriter.writeCharacters(request.header.getExtsysname());
			xMLStreamWriter.writeEndElement();//close extsysname
			
			xMLStreamWriter.writeEndElement();//close header
			
			xMLStreamWriter.writeEndElement();//close faxml
			
			xMLStreamWriter.writeEndElement();//close request
			xMLStreamWriter.writeEndDocument();
			xMLStreamWriter.flush();
			xMLStreamWriter.close();
			
			String xmlString = stringWriter.getBuffer().toString();
			xmlString = xmlString.replace("?>", " standalone=\"yes\" ?>");
			stringWriter.close();
			return xmlString;
		} catch (XMLStreamException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
