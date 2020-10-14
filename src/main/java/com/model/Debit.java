package com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "debit")
@XmlAccessorType(XmlAccessType.FIELD)
public class Debit {
	
	/**
	*(mandatory)start from 1 and keep on  incrementing by 1 for the day. (String 2)
	*/
	@XmlElement(name = "stanext", required = true)
	private String stanext;
	
	/**
	*(not-mandatory)This is Debit account number.This should belongs to valid group id. (String 16)
	*/
	@XmlElement(name = "accountno", required = true)
	private String accountno;
	
	/**
	*(mandatory)Amount should be greater then '0'.FLOAT(13,2)
	*/
	@XmlElement(name = "orgamount", required = true)
	private float orgamount;
	
	/**
	*(not-mandatory).String (120)
	*/
	@XmlElement(name = "txndesc", required = true)
	private String txndesc;
	
	/**
	*(mandatory).String (20)
	*/
	@XmlElement(name = "referenceno", required = true)
	private String referenceno;

	public String getStanext() {
		return stanext;
	}

	public void setStanext(String stanext) {
		this.stanext = stanext;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public float getOrgamount() {
		return orgamount;
	}

	public void setOrgamount(float orgamount) {
		this.orgamount = orgamount;
	}

	public String getTxndesc() {
		return txndesc;
	}

	public void setTxndesc(String txndesc) {
		this.txndesc = txndesc;
	}

	public String getReferenceno() {
		return referenceno;
	}

	public void setReferenceno(String referenceno) {
		this.referenceno = referenceno;
	}

	@Override
	public String toString() {
		return "Debit [stanext=" + stanext + ", accountno=" + accountno + ", orgamount=" + orgamount + ", txndesc="
				+ txndesc + ", referenceno=" + referenceno + "]";
	}
	
}
