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
	*(mandatory)Amount should be greater then '0'.FLOAT(13,2)
	*/
	@XmlElement(name = "amount", required = true)
	private float amount;
	
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
	
	/**
	*(mandatory).String (20)
	*/
	@XmlElement(name = "rrnrefno", required = true)
	private String rrnrefno;
	
	//Extra Parameter in IMPS Payment Method
	        
	/**
	*(mandatory).String (50)
	*/
	@XmlElement(name = "sendername", required = true)
	private String sendername;
	
	/**
	*(non-mandatory).String (12)
	*/
	@XmlElement(name = "sendermobile", required = true)
	private String sendermobile;
	
	/**
	*(non-mandatory).String (50)
	*/
	@XmlElement(name = "remarks", required = true)
	private String remarks;
	
	/**
	*(non-mandatory).String (11)
	*/
	@XmlElement(name = "interbranchifsc", required = true)
	private String interbranchifsc;
	
	/**
	*(non-mandatory).String (35)
	*/
	@XmlElement(name = "exchname", required = true)
	private String exchname;

	/**
	*(non-mandatory).String (35)
	*/
	@XmlElement(name = "originbankaccrefno", required = true)
	private String originbankaccrefno;
	
	/**
	*(non-mandatory).String (250)
	*/
	@XmlElement(name = "originadd", required = true)
	private String originadd;
	
	/**
	*(non-mandatory).String (3)
	*/
	@XmlElement(name = "remitteractype", required = true)
	private String remitteractype;
	
	
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

	
	public String getSendername() {
		return sendername;
	}

	public void setSendername(String sendername) {
		this.sendername = sendername;
	}

	public String getSendermobile() {
		return sendermobile;
	}

	public void setSendermobile(String sendermobile) {
		this.sendermobile = sendermobile;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getInterbranchifsc() {
		return interbranchifsc;
	}

	public void setInterbranchifsc(String interbranchifsc) {
		this.interbranchifsc = interbranchifsc;
	}

	public String getExchname() {
		return exchname;
	}

	public void setExchname(String exchname) {
		this.exchname = exchname;
	}

	public String getOriginbankaccrefno() {
		return originbankaccrefno;
	}

	public void setOriginbankaccrefno(String originbankaccrefno) {
		this.originbankaccrefno = originbankaccrefno;
	}

	public String getOriginadd() {
		return originadd;
	}

	public void setOriginadd(String originadd) {
		this.originadd = originadd;
	}

	public String getRemitteractype() {
		return remitteractype;
	}

	public void setRemitteractype(String remitteractype) {
		this.remitteractype = remitteractype;
	}
	
	
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getRrnrefno() {
		return rrnrefno;
	}

	public void setRrnrefno(String rrnrefno) {
		this.rrnrefno = rrnrefno;
	}

	@Override
	public String toString() {
		return "Debit [stanext=" + stanext + ", accountno=" + accountno + ", orgamount=" + orgamount + ", amount="
				+ amount + ", txndesc=" + txndesc + ", referenceno=" + referenceno + ", rrnrefno=" + rrnrefno
				+ ", sendername=" + sendername + ", sendermobile=" + sendermobile + ", remarks=" + remarks
				+ ", interbranchifsc=" + interbranchifsc + ", exchname=" + exchname + ", originbankaccrefno="
				+ originbankaccrefno + ", originadd=" + originadd + ", remitteractype=" + remitteractype + "]";
	}
	
	
}
