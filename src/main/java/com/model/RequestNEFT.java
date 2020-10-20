package com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "faxml")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestNEFT {
	
	
	@XmlElement(name = "header", required = true)
	public Header header;
	
	@XmlElement(name = "summary", required = true)
	public Summary summary;
	
	@XmlElement(name = "paymentlist", required = true)
	public Paymentlist paymentlist;

}
