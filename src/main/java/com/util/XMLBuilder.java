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
			
			// ******************** 2. debit **********************
			xMLStreamWriter.writeStartElement("debit");
			
			xMLStreamWriter.writeStartElement("stanext");
			xMLStreamWriter.writeCharacters(request.debit.getStanext());
			xMLStreamWriter.writeEndElement();// close stanext
			
			xMLStreamWriter.writeStartElement("accountno");
			xMLStreamWriter.writeCharacters(request.debit.getAccountno());
			xMLStreamWriter.writeEndElement();// close accountno
			
			xMLStreamWriter.writeStartElement("orgamount");
			xMLStreamWriter.writeCharacters(String.valueOf(request.debit.getOrgamount()));
			xMLStreamWriter.writeEndElement();// close orgamount
			
			xMLStreamWriter.writeStartElement("txndesc");
			xMLStreamWriter.writeCharacters(request.debit.getTxndesc());
			xMLStreamWriter.writeEndElement();// close txndesc
			
			xMLStreamWriter.writeStartElement("referenceno");
			xMLStreamWriter.writeCharacters(request.debit.getReferenceno());
			xMLStreamWriter.writeEndElement();// close referenceno
			
			xMLStreamWriter.writeEndElement();// close debit
			
			// ******************** 3. Credit List **********************
			xMLStreamWriter.writeStartElement("creditlist");
			
			xMLStreamWriter.writeStartElement("credit");
			
			xMLStreamWriter.writeStartElement("stanext");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getStanext());
			xMLStreamWriter.writeEndElement();// close stanext
			
			xMLStreamWriter.writeStartElement("accountno");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAccountno());
			xMLStreamWriter.writeEndElement();// close accountno
			
			xMLStreamWriter.writeStartElement("amount");
			xMLStreamWriter.writeCharacters(String.valueOf(request.creditlist.cridit.getAmount()));
			xMLStreamWriter.writeEndElement();// close amount
			
			xMLStreamWriter.writeStartElement("txndesc");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getTxndesc());
			xMLStreamWriter.writeEndElement();// close txndesc
			
			xMLStreamWriter.writeStartElement("referenceno");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getReferenceno());
			xMLStreamWriter.writeEndElement();// close referenceno
			
			xMLStreamWriter.writeStartElement("beneid");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getBeneid());
			xMLStreamWriter.writeEndElement();// close beneid
			
			xMLStreamWriter.writeStartElement("BeneName");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getBeneName());
			xMLStreamWriter.writeEndElement();// close BeneName
			
			xMLStreamWriter.writeStartElement("BeneAddress_1");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getBeneAddress_1());
			xMLStreamWriter.writeEndElement();// close BeneAddress_1
			
			xMLStreamWriter.writeStartElement("BeneAddress_2");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getBeneAddress_2());
			xMLStreamWriter.writeEndElement();// close BeneAddress_2
			
			xMLStreamWriter.writeStartElement("BeneAddress_3");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getBeneAddress_3());
			xMLStreamWriter.writeEndElement();// close BeneAddress_3
			
			xMLStreamWriter.writeStartElement("BeneAddress_4");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getBeneAddress_4());
			xMLStreamWriter.writeEndElement();// close BeneAddress_4
			
			xMLStreamWriter.writeStartElement("emailid");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getEmailid());
			xMLStreamWriter.writeEndElement();// close emailid
			
			xMLStreamWriter.writeStartElement("advice1");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAdvice1());
			xMLStreamWriter.writeEndElement();// close advice1
			
			xMLStreamWriter.writeStartElement("advice2");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAdvice2());
			xMLStreamWriter.writeEndElement();// close advice2
			
			xMLStreamWriter.writeStartElement("advice3");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAdvice3());
			xMLStreamWriter.writeEndElement();// close advice3
			
			
			xMLStreamWriter.writeStartElement("advice4");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAdvice4());
			xMLStreamWriter.writeEndElement();// close advice4

			xMLStreamWriter.writeStartElement("advice5");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAdvice5());
			xMLStreamWriter.writeEndElement();// close advice5

			
			xMLStreamWriter.writeStartElement("advice6");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAdvice6());
			xMLStreamWriter.writeEndElement();// close advice6
			
			xMLStreamWriter.writeStartElement("advice7");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAdvice7());
			xMLStreamWriter.writeEndElement();// close advice7
			
			xMLStreamWriter.writeStartElement("advice8");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAdvice8());
			xMLStreamWriter.writeEndElement();// close advice8
			
			xMLStreamWriter.writeStartElement("advice9");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAdvice9());
			xMLStreamWriter.writeEndElement();// close advice9
			
			xMLStreamWriter.writeStartElement("advice10");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAdvice10());
			xMLStreamWriter.writeEndElement();// close advice10
			
			xMLStreamWriter.writeStartElement("addnlfield1");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAddnlfield1());
			xMLStreamWriter.writeEndElement();// close addnlfield1
			
			xMLStreamWriter.writeStartElement("addnlfield2");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAddnlfield2());
			xMLStreamWriter.writeEndElement();// close addnlfield2
			
			xMLStreamWriter.writeStartElement("addnlfield3");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAddnlfield3());
			xMLStreamWriter.writeEndElement();// close addnlfield3
			
			xMLStreamWriter.writeStartElement("addnlfield4");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAddnlfield4());
			xMLStreamWriter.writeEndElement();// close addnlfield4
			
			xMLStreamWriter.writeStartElement("addnlfield5");
			xMLStreamWriter.writeCharacters(request.creditlist.cridit.getAddnlfield5());
			xMLStreamWriter.writeEndElement();// close addnlfield5
			
			
			xMLStreamWriter.writeEndElement();// close credit
			
			xMLStreamWriter.writeEndElement();// close creditlist
			
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
