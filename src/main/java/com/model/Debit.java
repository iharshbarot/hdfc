package com.model;

public class Debit {
	
	/**
	*(mandatory)start from 1 and keep on  incrementing by 1 for the day. (String 2)
	*/
	private String stanext;
	
	/**
	*(not-mandatory)This is Debit account number.This should belongs to valid group id. (String 16)
	*/
	private String accountno;
	
	/**
	*(mandatory)Amount should be greater then '0'.FLOAT(13,2)
	*/
	private float orgamount;
	
	/**
	*(not-mandatory).String (120)
	*/
	private String txndesc;
	
	/**
	*(mandatory).String (20)
	*/
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
