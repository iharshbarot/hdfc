package com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "creditlist")
@XmlAccessorType(XmlAccessType.FIELD)
public class Creditlist {

	@XmlElement(name = "credit", required = true)
	public Credit cridit;

}
