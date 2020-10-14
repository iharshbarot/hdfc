package com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "credit")
@XmlAccessorType(XmlAccessType.FIELD)
public class Credit {
	
	/**
	*(mandatory)start from 1 and keep on  incrementing by 1 for the day. (String 2)
	*/
	@XmlElement(name = "stanext", required = true)
	private String stanext;
	
	/**
	*(not-mandatory)Conditional Mandatory. If Bene Id is not received then this will be mandatory field. String(16)
	*/
	@XmlElement(name = "accountno", required = true)
	private String accountno;
	
	/**
	*(mandatory) a) Amount should be greater then '0'.  
	* b) Amount should be less then limit defined for Beneficiary. FLOAT(13,2)
	*/
	@XmlElement(name = "amount", required = true)
	private float amount;
	
	/**
	*(mandatory).String (40)
	*/
	@XmlElement(name = "txndesc", required = true)
	private String txndesc;
	
	/**
	*(mandatory).String (12)
	*/
	@XmlElement(name = "referenceno", required = true)
	private String referenceno;
	
	/**
	*(not-mandatory) Conditional Mandatory if credit accno is not mentioned in request then Beneid field is mandatory. String (30).
	*/
	@XmlElement(name = "beneid", required = true)
	private String beneid;
	
	/**
	*(not-mandatory)Conditional Mandatory. String (100).
	*/
	@XmlElement(name = "BeneName", required = true)
	private String BeneName;
	
	/**
	*(not-mandatory). String (35).
	*/
	@XmlElement(name = "BeneAddress_1", required = true)
	private String BeneAddress_1;
	
	/**
	*(not-mandatory). String (35).
	*/
	@XmlElement(name = "BeneAddress_2", required = true)
	private String BeneAddress_2;
	
	/**
	*(not-mandatory). String (35).
	*/
	@XmlElement(name = "BeneAddress_3", required = true)
	private String BeneAddress_3;
	
	/**
	*(not-mandatory). String (35).
	*/
	@XmlElement(name = "BeneAddress_4", required = true)
	private String BeneAddress_4;
	
	/**
	*(not-mandatory)Multiple email id can come in this field in coma separated format. String (25).
	*/
	@XmlElement(name = "emailid", required = true)
	private String emailid;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "advice1", required = true)
	private String advice1;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "advice2", required = true)
	private String advice2;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "advice3", required = true)
	private String advice3;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "advice4", required = true)
	private String advice4;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "advice5", required = true)
	private String advice5;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "advice6", required = true)
	private String advice6;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "advice7", required = true)
	private String advice7;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "advice8", required = true)
	private String advice8;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "advice9", required = true)
	private String advice9;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "advice10", required = true)
	private String advice10;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "addnlfield1", required = true)
	private String addnlfield1;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "addnlfield2", required = true)
	private String addnlfield2;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "addnlfield3", required = true)
	private String addnlfield3;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "addnlfield4", required = true)
	private String addnlfield4;
	
	/**
	*(not-mandatory)Conditional Mandatory if email id field having value then one of the advice field should have value (advice_1 to advice_10). String(40)
	*/
	@XmlElement(name = "addnlfield5", required = true)
	private String addnlfield5;

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

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
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

	public String getBeneid() {
		return beneid;
	}

	public void setBeneid(String beneid) {
		this.beneid = beneid;
	}

	public String getBeneName() {
		return BeneName;
	}

	public void setBeneName(String beneName) {
		BeneName = beneName;
	}

	public String getBeneAddress_1() {
		return BeneAddress_1;
	}

	public void setBeneAddress_1(String beneAddress_1) {
		BeneAddress_1 = beneAddress_1;
	}

	public String getBeneAddress_2() {
		return BeneAddress_2;
	}

	public void setBeneAddress_2(String beneAddress_2) {
		BeneAddress_2 = beneAddress_2;
	}

	public String getBeneAddress_3() {
		return BeneAddress_3;
	}

	public void setBeneAddress_3(String beneAddress_3) {
		BeneAddress_3 = beneAddress_3;
	}

	public String getBeneAddress_4() {
		return BeneAddress_4;
	}

	public void setBeneAddress_4(String beneAddress_4) {
		BeneAddress_4 = beneAddress_4;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAdvice1() {
		return advice1;
	}

	public void setAdvice1(String advice1) {
		this.advice1 = advice1;
	}

	public String getAdvice2() {
		return advice2;
	}

	public void setAdvice2(String advice2) {
		this.advice2 = advice2;
	}

	public String getAdvice3() {
		return advice3;
	}

	public void setAdvice3(String advice3) {
		this.advice3 = advice3;
	}

	public String getAdvice4() {
		return advice4;
	}

	public void setAdvice4(String advice4) {
		this.advice4 = advice4;
	}

	public String getAdvice5() {
		return advice5;
	}

	public void setAdvice5(String advice5) {
		this.advice5 = advice5;
	}

	public String getAdvice6() {
		return advice6;
	}

	public void setAdvice6(String advice6) {
		this.advice6 = advice6;
	}

	public String getAdvice7() {
		return advice7;
	}

	public void setAdvice7(String advice7) {
		this.advice7 = advice7;
	}

	public String getAdvice8() {
		return advice8;
	}

	public void setAdvice8(String advice8) {
		this.advice8 = advice8;
	}

	public String getAdvice9() {
		return advice9;
	}

	public void setAdvice9(String advice9) {
		this.advice9 = advice9;
	}

	public String getAdvice10() {
		return advice10;
	}

	public void setAdvice10(String advice10) {
		this.advice10 = advice10;
	}

	public String getAddnlfield1() {
		return addnlfield1;
	}

	public void setAddnlfield1(String addnlfield1) {
		this.addnlfield1 = addnlfield1;
	}

	public String getAddnlfield2() {
		return addnlfield2;
	}

	public void setAddnlfield2(String addnlfield2) {
		this.addnlfield2 = addnlfield2;
	}

	public String getAddnlfield3() {
		return addnlfield3;
	}

	public void setAddnlfield3(String addnlfield3) {
		this.addnlfield3 = addnlfield3;
	}

	public String getAddnlfield4() {
		return addnlfield4;
	}

	public void setAddnlfield4(String addnlfield4) {
		this.addnlfield4 = addnlfield4;
	}

	public String getAddnlfield5() {
		return addnlfield5;
	}

	public void setAddnlfield5(String addnlfield5) {
		this.addnlfield5 = addnlfield5;
	}

	@Override
	public String toString() {
		return "Credit [stanext=" + stanext + ", accountno=" + accountno + ", amount=" + amount + ", txndesc=" + txndesc
				+ ", referenceno=" + referenceno + ", beneid=" + beneid + ", BeneName=" + BeneName + ", BeneAddress_1="
				+ BeneAddress_1 + ", BeneAddress_2=" + BeneAddress_2 + ", BeneAddress_3=" + BeneAddress_3
				+ ", BeneAddress_4=" + BeneAddress_4 + ", emailid=" + emailid + ", advice1=" + advice1 + ", advice2="
				+ advice2 + ", advice3=" + advice3 + ", advice4=" + advice4 + ", advice5=" + advice5 + ", advice6="
				+ advice6 + ", advice7=" + advice7 + ", advice8=" + advice8 + ", advice9=" + advice9 + ", advice10="
				+ advice10 + ", addnlfield1=" + addnlfield1 + ", addnlfield2=" + addnlfield2 + ", addnlfield3="
				+ addnlfield3 + ", addnlfield4=" + addnlfield4 + ", addnlfield5=" + addnlfield5 + "]";
	}
	
	

}
