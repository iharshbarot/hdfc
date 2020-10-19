package com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "txnlist")
@XmlAccessorType(XmlAccessType.FIELD)
public class Paymentlist {
	
	@XmlElement(name = "payment", required = true)
	public Payment payment;

}
