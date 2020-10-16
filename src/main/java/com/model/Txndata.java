package com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "txndata")
@XmlAccessorType(XmlAccessType.FIELD)
public class Txndata {

	@XmlElement(name = "debit", required = true)
	public Debit debit;
	
	@XmlElement(name = "credit", required = true)
	public Credit cridit;
}
