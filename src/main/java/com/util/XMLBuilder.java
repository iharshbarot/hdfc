package com.util;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.model.RequestXML;

public class XMLBuilder {

	static String valOne = "xsi:noNamespaceSchemaLocation";
	static String valTwo = "http://www.w3.org/2001/XMLSchema-instance";
	public static String hdfcRequest(RequestXML request) {

		try {
			StringWriter stringWriter = new StringWriter();

			XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
			XMLStreamWriter xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);
			xMLStreamWriter.writeStartDocument("UTF-8", "1.0");
			xMLStreamWriter.writeStartElement("request");

			xMLStreamWriter.writeStartElement("faxml");
			xMLStreamWriter.writeAttribute("xmlns:xsi", valTwo);
			xMLStreamWriter.writeAttribute("xsi:noNamespaceSchemaLocation", valOne);
			
			// ******************** 1.Header **********************
			xMLStreamWriter.writeStartElement("header");

			xMLStreamWriter.writeStartElement("extsysname");
			xMLStreamWriter.writeCharacters(request.header.getExtsysname());
			xMLStreamWriter.writeEndElement();// close extsysname
			
			xMLStreamWriter.writeStartElement("datpost");
			xMLStreamWriter.writeCharacters(request.header.getDatpost());
			xMLStreamWriter.writeEndElement();// close datpost
			
			xMLStreamWriter.writeStartElement("batchnumext");
			xMLStreamWriter.writeCharacters(request.header.getBatchnumext());
			xMLStreamWriter.writeEndElement();// close batchnumext
			
			xMLStreamWriter.writeStartElement("idtxn");
			xMLStreamWriter.writeCharacters(request.header.getIdcust());
			xMLStreamWriter.writeEndElement();// close idtxn
			
			xMLStreamWriter.writeStartElement("codcurr");
			xMLStreamWriter.writeCharacters(request.header.getCodcurr());
			xMLStreamWriter.writeEndElement();// close codcurr
			
			xMLStreamWriter.writeStartElement("iduser");
			xMLStreamWriter.writeCharacters(request.header.getIduser());
			xMLStreamWriter.writeEndElement();// close iduser
			
			xMLStreamWriter.writeStartElement("idcust");
			xMLStreamWriter.writeCharacters(request.header.getIdcust());
			xMLStreamWriter.writeEndElement();// close idcust
			
			xMLStreamWriter.writeStartElement("groupid");
			xMLStreamWriter.writeCharacters(request.header.getGroupid());
			xMLStreamWriter.writeEndElement();// close groupid
			
			xMLStreamWriter.writeStartElement("reqdatetime");
			xMLStreamWriter.writeCharacters(request.header.getReqdatetime());
			xMLStreamWriter.writeEndElement();// close reqdatetime

			xMLStreamWriter.writeEndElement();// close header
			// ******************** 2. Summary **********************
			xMLStreamWriter.writeStartElement("summary");
			
			xMLStreamWriter.writeStartElement("orgcountdr");
			xMLStreamWriter.writeCharacters(String.valueOf(request.summary.getOrgcountdr()));
			xMLStreamWriter.writeEndElement();// close orgcountdr
			
			xMLStreamWriter.writeStartElement("orgcountcr");
			xMLStreamWriter.writeCharacters(String.valueOf(request.summary.getOrgcountcr()));
			xMLStreamWriter.writeEndElement();// close orgcountcr
			
			xMLStreamWriter.writeStartElement("orgsumdr");
			xMLStreamWriter.writeCharacters(String.valueOf(request.summary.getOrgsumdr()));
			xMLStreamWriter.writeEndElement();// close orgsumdr
			
			xMLStreamWriter.writeStartElement("orgsumcr");
			xMLStreamWriter.writeCharacters(String.valueOf(request.summary.getOrgsumcr()));
			xMLStreamWriter.writeEndElement();// close orgsumcr
			
			xMLStreamWriter.writeEndElement();// close summary
			
			xMLStreamWriter.writeEndElement();// close faxml

			xMLStreamWriter.writeEndElement();// close request
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
