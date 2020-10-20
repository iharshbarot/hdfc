package com.util;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.model.RequestNEFT;
import com.model.RequestPMPS;
import com.model.RequestRTGS;
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

	public static String IMPS(RequestPMPS request) {

		try {
			StringWriter stringWriter = new StringWriter();

			XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
			XMLStreamWriter xMLStreamWriter;
			xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);
			xMLStreamWriter.writeStartDocument("UTF-8", "1.0");
			xMLStreamWriter.writeStartElement("request");

			xMLStreamWriter.writeStartElement("faxml");
			xMLStreamWriter.writeAttribute("xmlns:xsi", valTwo);
			xMLStreamWriter.writeAttribute("xsi:noNamespaceSchemaLocation", valOne);

			xMLStreamWriter.writeEndElement();// close faxml
			// ******************** 1.Header **********************
			xMLStreamWriter.writeStartElement("header");
			;
			xMLStreamWriter.writeStartElement("extsysname");
			xMLStreamWriter.writeCharacters(request.header.extsysname);
			xMLStreamWriter.writeEndElement();// close extsysname

			xMLStreamWriter.writeStartElement("datpost");
			xMLStreamWriter.writeCharacters(request.header.getDatpost());
			xMLStreamWriter.writeEndElement();// close datpost

			xMLStreamWriter.writeStartElement("batchnumext");
			xMLStreamWriter.writeCharacters(request.header.getBatchnumext());
			xMLStreamWriter.writeEndElement();// close batchnumext

			xMLStreamWriter.writeStartElement("idtxn");
			xMLStreamWriter.writeCharacters(request.header.getIdtxn());
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

			// ******************** 2.Summary **********************
			xMLStreamWriter.writeStartElement("summary");

			xMLStreamWriter.writeStartElement("orgcountdr");
			xMLStreamWriter.writeCharacters(String.valueOf(request.summary.getOrgcountdr()));
			xMLStreamWriter.writeEndElement();// close orgcountdr

			xMLStreamWriter.writeStartElement("orgcountcr");
			xMLStreamWriter.writeCharacters(String.valueOf(request.summary.getOrgsumcr()));
			xMLStreamWriter.writeEndElement();// close orgcountcr

			xMLStreamWriter.writeStartElement("orgsumdr");
			xMLStreamWriter.writeCharacters(String.valueOf(request.summary.getOrgcountdr()));
			xMLStreamWriter.writeEndElement();// close orgsumdr

			xMLStreamWriter.writeStartElement("orgsumcr");
			xMLStreamWriter.writeCharacters(String.valueOf(request.summary.getOrgcountcr()));
			xMLStreamWriter.writeEndElement();// close orgsumcr

			xMLStreamWriter.writeEndElement();// close Summary

			// ******************** 3.txnlist **********************

			xMLStreamWriter.writeStartElement("txnlist");

			xMLStreamWriter.writeStartElement("txndata");

			xMLStreamWriter.writeStartElement("debit");

			xMLStreamWriter.writeStartElement("stanext");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.debit.getStanext());
			xMLStreamWriter.writeEndElement();// close stanext

			xMLStreamWriter.writeStartElement("accountno");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.debit.getAccountno());
			xMLStreamWriter.writeEndElement();// close accountno

			xMLStreamWriter.writeStartElement("amount");
			xMLStreamWriter.writeCharacters(String.valueOf(request.txnlist.txndata.debit.getAmount()));
			xMLStreamWriter.writeEndElement();// close amount

			xMLStreamWriter.writeStartElement("txndesc");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.debit.getTxndesc());
			xMLStreamWriter.writeEndElement();// close txndesc

			xMLStreamWriter.writeStartElement("rrnrefno");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.debit.getRrnrefno());
			xMLStreamWriter.writeEndElement();// close rrnrefno

			xMLStreamWriter.writeStartElement("sendername");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.debit.getSendername());
			xMLStreamWriter.writeEndElement();// close sendername

			xMLStreamWriter.writeStartElement("sendermobile");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.debit.getSendermobile());
			xMLStreamWriter.writeEndElement();// close sendermobile

			xMLStreamWriter.writeStartElement("remarks");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.debit.getRemarks());
			xMLStreamWriter.writeEndElement();// close remarks

			xMLStreamWriter.writeStartElement("interbranchifsc");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.debit.getInterbranchifsc());
			xMLStreamWriter.writeEndElement();// close interbranchifsc

			xMLStreamWriter.writeStartElement("exchname");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.debit.getExchname());
			xMLStreamWriter.writeEndElement();// close exchname

			xMLStreamWriter.writeStartElement("originbankaccrefno");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.debit.getOriginbankaccrefno());
			xMLStreamWriter.writeEndElement();// close originbankaccrefno

			xMLStreamWriter.writeStartElement("originadd");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.debit.getOriginadd());
			xMLStreamWriter.writeEndElement();// close originadd

			xMLStreamWriter.writeStartElement("remitteractype");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.debit.getRemitteractype());
			xMLStreamWriter.writeEndElement();// close remitteractype

			xMLStreamWriter.writeEndElement();// close debit

			// ******************** 3.1 credit **********************

			xMLStreamWriter.writeStartElement("credit");

			xMLStreamWriter.writeStartElement("stanext");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getStanext());
			xMLStreamWriter.writeEndElement();// close stanext

			xMLStreamWriter.writeStartElement("accountno");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAccountno());
			xMLStreamWriter.writeEndElement();// close accountno

			xMLStreamWriter.writeStartElement("amount");
			xMLStreamWriter.writeCharacters(String.valueOf(request.txnlist.txndata.cridit.getAmount()));
			xMLStreamWriter.writeEndElement();// close amount

			xMLStreamWriter.writeStartElement("txndesc");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getTxndesc());
			xMLStreamWriter.writeEndElement();// close txndesc

			xMLStreamWriter.writeStartElement("rrnrefno");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getRrnrefno());
			xMLStreamWriter.writeEndElement();// close rrnrefno

			xMLStreamWriter.writeStartElement("paymttype");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getPaymttype());
			xMLStreamWriter.writeEndElement();// close paymttype

			xMLStreamWriter.writeStartElement("ifsc");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getIfsc());
			xMLStreamWriter.writeEndElement();// close ifsc

			xMLStreamWriter.writeStartElement("beneacc");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getBeneacc());
			xMLStreamWriter.writeEndElement();// close beneacc

			xMLStreamWriter.writeStartElement("benename");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getBeneName());
			xMLStreamWriter.writeEndElement();// close benename

			xMLStreamWriter.writeStartElement("purposecode");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getPurposecode());
			xMLStreamWriter.writeEndElement();// close purposecode

			xMLStreamWriter.writeStartElement("beneacctype");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getBeneacctype());
			xMLStreamWriter.writeEndElement();// close beneacctype

			xMLStreamWriter.writeStartElement("beneid");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getBeneid());
			xMLStreamWriter.writeEndElement();// close beneid

			xMLStreamWriter.writeStartElement("emailid");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getEmailid());
			xMLStreamWriter.writeEndElement();// close emailid

			xMLStreamWriter.writeStartElement("advice1");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAdvice1());
			xMLStreamWriter.writeEndElement();// close advice1

			xMLStreamWriter.writeStartElement("advice2");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAdvice2());
			xMLStreamWriter.writeEndElement();// close advice2

			xMLStreamWriter.writeStartElement("advice3");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAdvice3());
			xMLStreamWriter.writeEndElement();// close advice3

			xMLStreamWriter.writeStartElement("advice4");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAdvice4());
			xMLStreamWriter.writeEndElement();// close advice4

			xMLStreamWriter.writeStartElement("advice5");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAdvice5());
			xMLStreamWriter.writeEndElement();// close advice5

			xMLStreamWriter.writeStartElement("advice6");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAdvice6());
			xMLStreamWriter.writeEndElement();// close advice6

			xMLStreamWriter.writeStartElement("advice7");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAdvice7());
			xMLStreamWriter.writeEndElement();// close advice7

			xMLStreamWriter.writeStartElement("advice8");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAdvice8());
			xMLStreamWriter.writeEndElement();// close advice8

			xMLStreamWriter.writeStartElement("advice9");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAdvice9());
			xMLStreamWriter.writeEndElement();// close advice9

			xMLStreamWriter.writeStartElement("advice10");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAdvice10());
			xMLStreamWriter.writeEndElement();// close advice10

			xMLStreamWriter.writeStartElement("advice1");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAdvice1());
			xMLStreamWriter.writeEndElement();// close advice1

			xMLStreamWriter.writeStartElement("addnlfield1");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAddnlfield1());
			xMLStreamWriter.writeEndElement();// close addnlfield1

			xMLStreamWriter.writeStartElement("addnlfield2");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAddnlfield2());
			xMLStreamWriter.writeEndElement();// close addnlfield2

			xMLStreamWriter.writeStartElement("addnlfield3");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAddnlfield3());
			xMLStreamWriter.writeEndElement();// close addnlfield3

			xMLStreamWriter.writeStartElement("addnlfield4");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAddnlfield4());
			xMLStreamWriter.writeEndElement();// close addnlfield4

			xMLStreamWriter.writeStartElement("addnlfield5");
			xMLStreamWriter.writeCharacters(request.txnlist.txndata.cridit.getAddnlfield5());
			xMLStreamWriter.writeEndElement();// close addnlfield5

			xMLStreamWriter.writeEndElement();// close credit

			xMLStreamWriter.writeEndElement();// close txndata

			xMLStreamWriter.writeEndElement();// close txnlist

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

	public static String RTGS(RequestRTGS request) {
		try {
			StringWriter stringWriter = new StringWriter();

			XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
			XMLStreamWriter xMLStreamWriter;
			xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);
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
			xMLStreamWriter.writeCharacters(request.header.getIdtxn());
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

			// ******************** 2.summary **********************
			xMLStreamWriter.writeStartElement("summary");

			xMLStreamWriter.writeStartElement("orgcountpmt");
			xMLStreamWriter.writeCharacters(String.valueOf(request.summary.getOrgcountpmt()));
			xMLStreamWriter.writeEndElement();// close orgcountpmt

			xMLStreamWriter.writeStartElement("orgsumpmt");
			xMLStreamWriter.writeCharacters(String.valueOf(request.summary.getOrgsumpmt()));
			xMLStreamWriter.writeEndElement();// close orgsumpmt

			xMLStreamWriter.writeEndElement();// close summary

			// ******************** 3.paymentlist **********************
			xMLStreamWriter.writeStartElement("paymentlist");

			xMLStreamWriter.writeStartElement("payment");

			xMLStreamWriter.writeStartElement("stanext");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getStanext());
			xMLStreamWriter.writeEndElement();// close stanext

			xMLStreamWriter.writeStartElement("refstan");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRefstan());
			xMLStreamWriter.writeEndElement();// close refstan

			xMLStreamWriter.writeStartElement("paymentrefno");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getPaymentrefno());
			xMLStreamWriter.writeEndElement();// close paymentrefno

			xMLStreamWriter.writeStartElement("accounttype");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAccounttype());
			xMLStreamWriter.writeEndElement();// close accounttype

			xMLStreamWriter.writeStartElement("accountno");
			xMLStreamWriter.writeCharacters(String.valueOf(request.paymentlist.payment.getAccountno()));
			xMLStreamWriter.writeEndElement();// close accountno

			xMLStreamWriter.writeStartElement("ifsccode");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getIfsccode());
			xMLStreamWriter.writeEndElement();// close ifsccode

			xMLStreamWriter.writeStartElement("txndate");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getTxndate());
			xMLStreamWriter.writeEndElement();// close txndate

			xMLStreamWriter.writeStartElement("amount");
			xMLStreamWriter.writeCharacters(String.valueOf(request.paymentlist.payment.getAmount()));
			xMLStreamWriter.writeEndElement();// close amount

			xMLStreamWriter.writeStartElement("custdet");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getCustdet());
			xMLStreamWriter.writeEndElement();// close custdet

			xMLStreamWriter.writeStartElement("benefaccountno");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getBenefaccountno());
			xMLStreamWriter.writeEndElement();// close benefaccountno

			xMLStreamWriter.writeStartElement("benefcustdet");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getBenefcustdet());
			xMLStreamWriter.writeEndElement();// close benefcustdet

			xMLStreamWriter.writeStartElement("custuniqno");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getCustuniqno());
			xMLStreamWriter.writeEndElement();// close custuniqno

			xMLStreamWriter.writeStartElement("custdetadd1");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getCustdetadd1());
			xMLStreamWriter.writeEndElement();// close custdetadd1

			xMLStreamWriter.writeStartElement("custdetadd2");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getCustdetadd2());
			xMLStreamWriter.writeEndElement();// close custdetadd2

			xMLStreamWriter.writeStartElement("exchgnam");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getExchgnam());
			xMLStreamWriter.writeEndElement();// close exchgnam

			xMLStreamWriter.writeStartElement("clientrefno");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getClientrefno());
			xMLStreamWriter.writeEndElement();// close clientrefno

			xMLStreamWriter.writeStartElement("paydetail");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getPaydetail());
			xMLStreamWriter.writeEndElement();// close paydetail

			xMLStreamWriter.writeStartElement("forcedebit");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getForcedebit());
			xMLStreamWriter.writeEndElement();// close forcedebit

			xMLStreamWriter.writeStartElement("beneid");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getBeneid());
			xMLStreamWriter.writeEndElement();// close beneid

			xMLStreamWriter.writeStartElement("emailid");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getEmailid());
			xMLStreamWriter.writeEndElement();// close emailid

			xMLStreamWriter.writeStartElement("RemitInformation_1");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitInformation_1());
			xMLStreamWriter.writeEndElement();// close RemitInformation_1

			xMLStreamWriter.writeStartElement("RemitInformation_2");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitInformation_2());
			xMLStreamWriter.writeEndElement();// close RemitInformation_2

			xMLStreamWriter.writeStartElement("RemitInformation_3");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitInformation_3());
			xMLStreamWriter.writeEndElement();// close RemitInformation_3

			xMLStreamWriter.writeStartElement("RemitInformation_4");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitInformation_4());
			xMLStreamWriter.writeEndElement();// close RemitInformation_4

			xMLStreamWriter.writeStartElement("RemitInformation_5");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitInformation_5());
			xMLStreamWriter.writeEndElement();// close RemitInformation_5

			xMLStreamWriter.writeStartElement("advice1");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice1());
			xMLStreamWriter.writeEndElement();// close advice1

			xMLStreamWriter.writeStartElement("advice2");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice2());
			xMLStreamWriter.writeEndElement();// close advice2

			xMLStreamWriter.writeStartElement("advice3");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice3());
			xMLStreamWriter.writeEndElement();// close advice3

			xMLStreamWriter.writeStartElement("advice4");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice4());
			xMLStreamWriter.writeEndElement();// close advice4

			xMLStreamWriter.writeStartElement("advice5");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice5());
			xMLStreamWriter.writeEndElement();// close advice5

			xMLStreamWriter.writeStartElement("advice6");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice6());
			xMLStreamWriter.writeEndElement();// close advice6

			xMLStreamWriter.writeStartElement("advice7");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice7());
			xMLStreamWriter.writeEndElement();// close advice7

			xMLStreamWriter.writeStartElement("advice8");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice8());
			xMLStreamWriter.writeEndElement();// close advice8

			xMLStreamWriter.writeStartElement("advice9");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice9());
			xMLStreamWriter.writeEndElement();// close advice9

			xMLStreamWriter.writeStartElement("advice10");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice10());
			xMLStreamWriter.writeEndElement();// close advice10

			xMLStreamWriter.writeStartElement("addnlfield1");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAddnlfield1());
			xMLStreamWriter.writeEndElement();// close addnlfield1

			xMLStreamWriter.writeStartElement("addnlfield2");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAddnlfield2());
			xMLStreamWriter.writeEndElement();// close addnlfield2

			xMLStreamWriter.writeStartElement("addnlfield3");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAddnlfield3());
			xMLStreamWriter.writeEndElement();// close addnlfield3

			xMLStreamWriter.writeStartElement("addnlfield4");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAddnlfield4());
			xMLStreamWriter.writeEndElement();// close addnlfield4

			xMLStreamWriter.writeStartElement("addnlfield5");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAddnlfield5());
			xMLStreamWriter.writeEndElement();// close addnlfield5

			xMLStreamWriter.writeEndElement();// close payment

			xMLStreamWriter.writeEndElement();// close paymentlist
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
			e.printStackTrace();
			return null;
		}

	}
	
	
	public static String NEFT(RequestNEFT  request)
	{
		try {
			StringWriter stringWriter = new StringWriter();

			XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
			XMLStreamWriter xMLStreamWriter;
			xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);
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
			xMLStreamWriter.writeCharacters(request.header.getIdtxn());
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
			
			// ******************** 1.Summary **********************
			
			xMLStreamWriter.writeStartElement("summary");
			
			xMLStreamWriter.writeStartElement("orgsumpmt");
			xMLStreamWriter.writeCharacters(String.valueOf(request.summary.getOrgsumpmt()));
			xMLStreamWriter.writeEndElement();// close orgsumpmt
			
			xMLStreamWriter.writeStartElement("orgcountpmt");
			xMLStreamWriter.writeCharacters(String.valueOf(request.summary.getOrgcountpmt()));
			xMLStreamWriter.writeEndElement();// close orgcountpmt
			
			
			xMLStreamWriter.writeEndElement();// close Summary
			
			
			// ******************** 1.PaymentList **********************
			
			xMLStreamWriter.writeStartElement("paymentlist");

			xMLStreamWriter.writeStartElement("payment");
			
			
			xMLStreamWriter.writeStartElement("stanext");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getStanext());
			xMLStreamWriter.writeEndElement();// close stanext
			
			xMLStreamWriter.writeStartElement("paymentrefno");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getPaymentrefno());
			xMLStreamWriter.writeEndElement();// close paymentrefno
			
			xMLStreamWriter.writeStartElement("CustId");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getCustId());
			xMLStreamWriter.writeEndElement();// close CustId
			
			xMLStreamWriter.writeStartElement("Amount");
			xMLStreamWriter.writeCharacters(String.valueOf(request.paymentlist.payment.getAmount()));
			xMLStreamWriter.writeEndElement();// close Amount
			
			xMLStreamWriter.writeStartElement("RemitterName");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitterName());
			xMLStreamWriter.writeEndElement();// close RemitterName
			
			xMLStreamWriter.writeStartElement("RemitterAccount");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitterAccount());
			xMLStreamWriter.writeEndElement();// close RemitterAccount
			
			xMLStreamWriter.writeStartElement("RemitterAccountType");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitterAccountType());
			xMLStreamWriter.writeEndElement();// close RemitterAccountType
			
			xMLStreamWriter.writeStartElement("Remitter_Address_1");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitter_Address_1());
			xMLStreamWriter.writeEndElement();// close Remitter_Address_1
			
			xMLStreamWriter.writeStartElement("Remitter_Address_2");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitter_Address_2());
			xMLStreamWriter.writeEndElement();// close Remitter_Address_2
			
			xMLStreamWriter.writeStartElement("Remitter_Address_3");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitter_Address_3());
			xMLStreamWriter.writeEndElement();// close Remitter_Address_3
			
			xMLStreamWriter.writeStartElement("Remitter_Address_4");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitter_Address_4());
			xMLStreamWriter.writeEndElement();// close Remitter_Address_4
			
			xMLStreamWriter.writeStartElement("BeneIFSCCODE");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getBeneIFSCCODE());
			xMLStreamWriter.writeEndElement();// close BeneIFSCCODE
			
			xMLStreamWriter.writeStartElement("BeneAccountType");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getBeneAccountType());
			xMLStreamWriter.writeEndElement();// close BeneAccountType
			
			xMLStreamWriter.writeStartElement("BeneAccountNumber");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getBeneAccountNumber());
			xMLStreamWriter.writeEndElement();// close BeneAccountNumber
			
			xMLStreamWriter.writeStartElement("BeneName");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getBeneName());
			xMLStreamWriter.writeEndElement();// close BeneName
			
			xMLStreamWriter.writeStartElement("BeneAddress_1");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getBeneAddress_1());
			xMLStreamWriter.writeEndElement();// close BeneAddress_1
			
			xMLStreamWriter.writeStartElement("BeneAddress_2");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getBeneAddress_2());
			xMLStreamWriter.writeEndElement();// close BeneAddress_2
			
			xMLStreamWriter.writeStartElement("BeneAddress_3");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getBeneAddress_3());
			xMLStreamWriter.writeEndElement();// close BeneAddress_3
			
			xMLStreamWriter.writeStartElement("BeneAddress_4");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getBeneAddress_4());
			xMLStreamWriter.writeEndElement();// close BeneAddress_4
			
			xMLStreamWriter.writeStartElement("RemitInformation_1");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitInformation_1());
			xMLStreamWriter.writeEndElement();// close RemitInformation_1
			
			xMLStreamWriter.writeStartElement("RemitInformation_2");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitInformation_2());
			xMLStreamWriter.writeEndElement();// close RemitInformation_2
			
			xMLStreamWriter.writeStartElement("RemitInformation_3");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitInformation_3());
			xMLStreamWriter.writeEndElement();// close RemitInformation_3
			
			xMLStreamWriter.writeStartElement("RemitInformation_4");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitInformation_4());
			xMLStreamWriter.writeEndElement();// close RemitInformation_4
			
			xMLStreamWriter.writeStartElement("RemitInformation_5");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitInformation_5());
			xMLStreamWriter.writeEndElement();// close RemitInformation_5
			
			xMLStreamWriter.writeStartElement("RemitInformation_6");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRemitInformation_6());
			xMLStreamWriter.writeEndElement();// close RemitInformation_6
			
			xMLStreamWriter.writeStartElement("ContactDetailsID");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getContactDetailsID());
			xMLStreamWriter.writeEndElement();// close ContactDetailsID
			
			xMLStreamWriter.writeStartElement("ContactDetailsDETAIL");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getContactDetailsDETAIL());
			xMLStreamWriter.writeEndElement();// close ContactDetailsDETAIL
			
			xMLStreamWriter.writeStartElement("codcurr");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getCodcurr());
			xMLStreamWriter.writeEndElement();// close codcurr
			
			xMLStreamWriter.writeStartElement("refstan");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getRefstan());
			xMLStreamWriter.writeEndElement();// close refstan
			
			xMLStreamWriter.writeStartElement("forcedebit");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getForcedebit());
			xMLStreamWriter.writeEndElement();// close forcedebit
			
			xMLStreamWriter.writeStartElement("txndesc");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getTxndesc());
			xMLStreamWriter.writeEndElement();// close txndesc
			
			xMLStreamWriter.writeStartElement("beneid");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getBeneid());
			xMLStreamWriter.writeEndElement();// close beneid
			
			xMLStreamWriter.writeStartElement("emailid");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getEmailid());
			xMLStreamWriter.writeEndElement();// close emailid
			
			xMLStreamWriter.writeStartElement("advice1");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice1());
			xMLStreamWriter.writeEndElement();// close advice1
			
			xMLStreamWriter.writeStartElement("advice2");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice2());
			xMLStreamWriter.writeEndElement();// close advice2
			
			xMLStreamWriter.writeStartElement("advice3");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice3());
			xMLStreamWriter.writeEndElement();// close advice3
			
			xMLStreamWriter.writeStartElement("advice4");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice4());
			xMLStreamWriter.writeEndElement();// close advice4
			
			xMLStreamWriter.writeStartElement("advice5");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice5());
			xMLStreamWriter.writeEndElement();// close advice5
			
			xMLStreamWriter.writeStartElement("advice6");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice6());
			xMLStreamWriter.writeEndElement();// close advice6
			
			xMLStreamWriter.writeStartElement("advice7");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice7());
			xMLStreamWriter.writeEndElement();// close advice7
			
			xMLStreamWriter.writeStartElement("advice8");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice8());
			xMLStreamWriter.writeEndElement();// close advice8
			
			xMLStreamWriter.writeStartElement("advice9");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice9());
			xMLStreamWriter.writeEndElement();// close advice9
			
			xMLStreamWriter.writeStartElement("advice10");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAdvice10());
			xMLStreamWriter.writeEndElement();// close advice10
			
			xMLStreamWriter.writeStartElement("addnlfield1");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAddnlfield1());
			xMLStreamWriter.writeEndElement();// close addnlfield1
			
			xMLStreamWriter.writeStartElement("addnlfield2");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAddnlfield2());
			xMLStreamWriter.writeEndElement();// close addnlfield2
			
			xMLStreamWriter.writeStartElement("addnlfield3");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAddnlfield3());
			xMLStreamWriter.writeEndElement();// close addnlfield3
			
			xMLStreamWriter.writeStartElement("addnlfield4");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAddnlfield4());
			xMLStreamWriter.writeEndElement();// close addnlfield4
			
			xMLStreamWriter.writeStartElement("addnlfield5");
			xMLStreamWriter.writeCharacters(request.paymentlist.payment.getAddnlfield5());
			xMLStreamWriter.writeEndElement();// close addnlfield5		
			
			xMLStreamWriter.writeEndElement();// close payment
			
			xMLStreamWriter.writeEndElement();// close paymentlist
			
			
			xMLStreamWriter.writeEndElement();// close faxml
			xMLStreamWriter.writeEndElement();// close request
			xMLStreamWriter.writeEndDocument();
			xMLStreamWriter.flush();
			xMLStreamWriter.close();

			String xmlString = stringWriter.getBuffer().toString();
			xmlString = xmlString.replace("?>", " standalone=\"yes\" ?>");
			stringWriter.close();
			return xmlString;
		
		}catch(XMLStreamException | IOException e)
		{
			e.printStackTrace();
			return null;
		}
		
		
		
	}
	

	
	

}
