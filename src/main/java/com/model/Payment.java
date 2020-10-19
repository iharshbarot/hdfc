package com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "payment")
@XmlAccessorType(XmlAccessType.FIELD)
public class Payment {

	/**
	 * (mandatory)start from 1 and keep on incrementing by 1 for the day. (String 2)
	 */
	@XmlElement(name = "stanext", required = true)
	private String stanext;

	/**
	 * (mandatory)Channel Reference Number provided by third party system. (String
	 * 16)
	 */
	@XmlElement(name = "paymentrefno", required = true)
	private String paymentrefno;

	/**
	 * (non-mandatory)Customer Id provided by third party system. No validation from
	 * FC. (String 10)
	 */
	@XmlElement(name = "CustId", required = true)
	private String CustId;

	/**
	 * (mandatory)Credit & Debit Amount a) Amount should be greater then '0' b)
	 * Amount should be less then limit defined for Beneficiary. (Float 13,2)
	 */
	@XmlElement(name = "amount", required = true)
	private Float amount;

	
	/**
	 * (mandatory)Credit & Debit Amount a) Amount should be greater then '0' b)
	 * Amount should be less then limit defined for Beneficiary. (Float 13,2)
	 */
	@XmlElement(name = "accountno", required = true)
	private Float accountno;
	
	
	
	
	/**
	 * (mandatory) (String 50)
	 */
	@XmlElement(name = "RemitterName", required = true)
	private String RemitterName;

	/**
	 * (mandatory)This should belongs to valid group id. (String 35)
	 */
	@XmlElement(name = "RemitterAccount", required = true)
	private String RemitterAccount;

	/**
	 * (non-mandatory) (String 2)
	 */
	@XmlElement(name = "RemitterAccountType", required = true)
	private String RemitterAccountType;

	/**
	 * (non-mandatory) (String 2)
	 */
	@XmlElement(name = "accounttype", required = true)
	private String accounttype;

	
	/**
	 * (non-mandatory) (String 35)
	 */
	@XmlElement(name = "Remitter_Address_1", required = true)
	private String Remitter_Address_1;

	/**
	 * (non-mandatory) (String 35)
	 */
	@XmlElement(name = "Remitter_Address_2", required = true)
	private String Remitter_Address_2;

	/**
	 * (non-mandatory) (String 35)
	 */
	@XmlElement(name = "Remitter_Address_3", required = true)
	private String Remitter_Address_3;

	/**
	 * (non-mandatory) (String 35)
	 */
	@XmlElement(name = "Remitter_Address_4", required = true)
	private String Remitter_Address_4;

	/**
	 * (non-mandatory)Conditional Mandatory, validated with FC connection (String
	 * 11)
	 */
	@XmlElement(name = "BeneIFSCCODE", required = true)
	private String BeneIFSCCODE;

	/**
	 * (non-mandatory)Conditional Mandatory, validated with FC connection (String
	 * 11)
	 */
	@XmlElement(name = "ifsccode", required = true)
	private String ifsccode;
	
	/**
	 * (non-mandatory) (String 10)
	 */
	@XmlElement(name = "BeneAccountType", required = true)
	private String BeneAccountType;

	/**
	 * (non-mandatory)Conditional Mandatory. If Bene Id is not received then this
	 * will be mandatory field (String 35)
	 */
	@XmlElement(name = "BeneAccountNumber", required = true)
	private String BeneAccountNumber;

	/**
	 * (mandatory)Conditional Mandatory (String 100)
	 */
	@XmlElement(name = "BeneName", required = true)
	private String BeneName;

	/**
	 * (non-mandatory) (String 30)
	 */
	@XmlElement(name = "BeneAddress_1", required = true)
	private String BeneAddress_1;

	/**
	 * (non-mandatory) (String 30)
	 */
	@XmlElement(name = "BeneAddress_2", required = true)
	private String BeneAddress_2;

	/**
	 * (non-mandatory) (String 30)
	 */
	@XmlElement(name = "BeneAddress_3", required = true)
	private String BeneAddress_3;

	/**
	 * (non-mandatory) (String 30)
	 */
	@XmlElement(name = "BeneAddress_4", required = true)
	private String BeneAddress_4;

	/**
	 * (non-mandatory) (String 35)
	 */
	@XmlElement(name = "RemitInformation_1", required = true)
	private String RemitInformation_1;

	/**
	 * (non-mandatory) (String 35)
	 */
	@XmlElement(name = "RemitInformation_2", required = true)
	private String RemitInformation_2;

	/**
	 * (non-mandatory) (String 35)
	 */
	@XmlElement(name = "RemitInformation_3", required = true)
	private String RemitInformation_3;

	/**
	 * (non-mandatory) (String 35)
	 */
	@XmlElement(name = "RemitInformation_4", required = true)
	private String RemitInformation_4;

	/**
	 * (non-mandatory) (String 35)
	 */
	@XmlElement(name = "RemitInformation_5", required = true)
	private String RemitInformation_5;

	/**
	 * (non-mandatory) (String 35)
	 */
	@XmlElement(name = "RemitInformation_6", required = true)
	private String RemitInformation_6;

	/**
	 * (non-mandatory) (String 30)
	 */
	@XmlElement(name = "ContactDetailsID", required = true)
	private String ContactDetailsID;

	/**
	 * (non-mandatory) (String 100)
	 */
	@XmlElement(name = "ContactDetailsDETAIL", required = true)
	private String ContactDetailsDETAIL;

	/**
	 * (mandatory)This will be always 'INR' (String 3)
	 */
	@XmlElement(name = "codcurr", required = true)
	private String codcurr;

	/**
	 * (mandatory) (String 2)
	 */
	@XmlElement(name = "refstan", required = true)
	private String refstan;

	/**
	 * (non-mandatory)This flag will be validated in FC. (String 1)
	 */
	@XmlElement(name = "forcedebit", required = true)
	private String forcedebit;

	/**
	 * (non-mandatory) (String 40)
	 */
	@XmlElement(name = "txndesc", required = true)
	private String txndesc;

	/**
	 * (non-mandatory)Conditional Mandatory. Incase creditaccno, beneifsccode and
	 * benename is blank then beneid is mandatory. (String 30)
	 */
	@XmlElement(name = "beneid", required = true)
	private String beneid;

	/**
	 * (non-mandatory)Multiple email id can come in this field in coma separated
	 * format (String 255)
	 */
	@XmlElement(name = "emailid", required = true)
	private String emailid;

	/**
	 * (non-mandatory)Conditional Mandatory if email id field having value then one
	 * of the advice field should have value (advice_1 to advice_10) (String 40)
	 */
	@XmlElement(name = "advice1", required = true)
	private String advice1;

	/**
	 * (non-mandatory)Conditional Mandatory if email id field having value then one
	 * of the advice field should have value (advice_1 to advice_10) (String 40)
	 */
	@XmlElement(name = "advice2", required = true)
	private String advice2;

	/**
	 * (non-mandatory)Conditional Mandatory if email id field having value then one
	 * of the advice field should have value (advice_1 to advice_10) (String 40)
	 */
	@XmlElement(name = "advice3", required = true)
	private String advice3;

	/**
	 * (non-mandatory)Conditional Mandatory if email id field having value then one
	 * of the advice field should have value (advice_1 to advice_10) (String 40)
	 */
	@XmlElement(name = "advice4", required = true)
	private String advice4;

	/**
	 * (non-mandatory)Conditional Mandatory if email id field having value then one
	 * of the advice field should have value (advice_1 to advice_10) (String 40)
	 */
	@XmlElement(name = "advice5", required = true)
	private String advice5;

	/**
	 * (non-mandatory)Conditional Mandatory if email id field having value then one
	 * of the advice field should have value (advice_1 to advice_10) (String 40)
	 */
	@XmlElement(name = "advice6", required = true)
	private String advice6;

	/**
	 * (non-mandatory)Conditional Mandatory if email id field having value then one
	 * of the advice field should have value (advice_1 to advice_10) (String 40)
	 */
	@XmlElement(name = "advice7", required = true)
	private String advice7;

	/**
	 * (non-mandatory)Conditional Mandatory if email id field having value then one
	 * of the advice field should have value (advice_1 to advice_10) (String 40)
	 */
	@XmlElement(name = "advice8", required = true)
	private String advice8;

	/**
	 * (non-mandatory)Conditional Mandatory if email id field having value then one
	 * of the advice field should have value (advice_1 to advice_10) (String 40)
	 */
	@XmlElement(name = "advice9", required = true)
	private String advice9;

	/**
	 * (non-mandatory)Conditional Mandatory if email id field having value then one
	 * of the advice field should have value (advice_1 to advice_10) (String 40)
	 */
	@XmlElement(name = "advice10", required = true)
	private String advice10;

	/**
	 * (non-mandatory)Future Provision (String 40)
	 */
	@XmlElement(name = "addnlfield1", required = true)
	private String addnlfield1;

	/**
	 * (non-mandatory)Future Provision (String 40)
	 */
	@XmlElement(name = "addnlfield2", required = true)
	private String addnlfield2;

	/**
	 * (non-mandatory)Future Provision (String 40)
	 */
	@XmlElement(name = "addnlfield3", required = true)
	private String addnlfield3;

	/**
	 * (non-mandatory)Future Provision (String 40)
	 */
	@XmlElement(name = "addnlfield4", required = true)
	private String addnlfield4;

	/**
	 * (non-mandatory)Future Provision (String 40)
	 */
	@XmlElement(name = "addnlfield5", required = true)
	private String addnlfield5;

	// Extra Parameter in RTGS Payment Method

	/**
	 * (mandatory). (String 40)
	 */
	@XmlElement(name = "txndate", required = true)
	private String txndate;

	/**
	 * (mandatory). (String 10)
	 */
	@XmlElement(name = "custdet", required = true)
	private String custdet;

	/**
	 * (mandatory)Conditional Mandatory. If Bene Id is not received then this will
	 * be mandatory field. (String 35)
	 */
	@XmlElement(name = "benefaccountno", required = true)
	private String benefaccountno;

	/**
	 * (mandatory)Conditional Mandatory. If Bene Id is not received then this will
	 * be mandatory field. (String 35)
	 */
	@XmlElement(name = "benefcustdet", required = true)
	private String benefcustdet;

	/**
	 * (mandatory)Conditional Mandatory. If Bene Id is not received then this will
	 * be mandatory field. (String 35)
	 */
	@XmlElement(name = "custuniqno", required = true)
	private String custuniqno;

	/**
	 * (mandatory)Conditional Mandatory. If Bene Id is not received then this will
	 * be mandatory field. (String 35)
	 */
	@XmlElement(name = "custdetadd1", required = true)
	private String custdetadd1;

	/**
	 * (mandatory)Conditional Mandatory. If Bene Id is not received then this will
	 * be mandatory field. (String 35)
	 */
	@XmlElement(name = "custdetadd2", required = true)
	private String custdetadd2;

	/**
	 * (non-mandatory)Conditional Mandatory. If Bene Id is not received then this
	 * will be mandatory field. (String 35)
	 */
	@XmlElement(name = "exchgnam", required = true)
	private String exchgnam;

	/**
	 * (non-mandatory).(String 35)
	 */
	@XmlElement(name = "clientrefno", required = true)
	private String clientrefno;

	/**
	 * (non-mandatory).(String 35)
	 */
	@XmlElement(name = "paydetail", required = true)
	private String paydetail;
	
	
	
	public String getStanext() {
		return stanext;
	}

	public void setStanext(String stanext) {
		this.stanext = stanext;
	}

	public String getPaymentrefno() {
		return paymentrefno;
	}

	public void setPaymentrefno(String paymentrefno) {
		this.paymentrefno = paymentrefno;
	}

	public String getCustId() {
		return CustId;
	}

	public void setCustId(String custId) {
		CustId = custId;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getRemitterName() {
		return RemitterName;
	}

	public void setRemitterName(String remitterName) {
		RemitterName = remitterName;
	}

	public String getRemitterAccount() {
		return RemitterAccount;
	}

	public void setRemitterAccount(String remitterAccount) {
		RemitterAccount = remitterAccount;
	}

	public String getRemitterAccountType() {
		return RemitterAccountType;
	}

	public void setRemitterAccountType(String remitterAccountType) {
		RemitterAccountType = remitterAccountType;
	}

	public String getRemitter_Address_1() {
		return Remitter_Address_1;
	}

	public void setRemitter_Address_1(String remitter_Address_1) {
		Remitter_Address_1 = remitter_Address_1;
	}

	public String getRemitter_Address_2() {
		return Remitter_Address_2;
	}

	public void setRemitter_Address_2(String remitter_Address_2) {
		Remitter_Address_2 = remitter_Address_2;
	}

	public String getRemitter_Address_3() {
		return Remitter_Address_3;
	}

	public void setRemitter_Address_3(String remitter_Address_3) {
		Remitter_Address_3 = remitter_Address_3;
	}

	public String getRemitter_Address_4() {
		return Remitter_Address_4;
	}

	public void setRemitter_Address_4(String remitter_Address_4) {
		Remitter_Address_4 = remitter_Address_4;
	}

	public String getBeneIFSCCODE() {
		return BeneIFSCCODE;
	}

	public void setBeneIFSCCODE(String beneIFSCCODE) {
		BeneIFSCCODE = beneIFSCCODE;
	}

	public String getBeneAccountType() {
		return BeneAccountType;
	}

	public void setBeneAccountType(String beneAccountType) {
		BeneAccountType = beneAccountType;
	}

	public String getBeneAccountNumber() {
		return BeneAccountNumber;
	}

	public void setBeneAccountNumber(String beneAccountNumber) {
		BeneAccountNumber = beneAccountNumber;
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

	public String getRemitInformation_1() {
		return RemitInformation_1;
	}

	public void setRemitInformation_1(String remitInformation_1) {
		RemitInformation_1 = remitInformation_1;
	}

	public String getRemitInformation_2() {
		return RemitInformation_2;
	}

	public void setRemitInformation_2(String remitInformation_2) {
		RemitInformation_2 = remitInformation_2;
	}

	public String getRemitInformation_3() {
		return RemitInformation_3;
	}

	public void setRemitInformation_3(String remitInformation_3) {
		RemitInformation_3 = remitInformation_3;
	}

	public String getRemitInformation_4() {
		return RemitInformation_4;
	}

	public void setRemitInformation_4(String remitInformation_4) {
		RemitInformation_4 = remitInformation_4;
	}

	public String getRemitInformation_5() {
		return RemitInformation_5;
	}

	public void setRemitInformation_5(String remitInformation_5) {
		RemitInformation_5 = remitInformation_5;
	}

	public String getRemitInformation_6() {
		return RemitInformation_6;
	}

	public void setRemitInformation_6(String remitInformation_6) {
		RemitInformation_6 = remitInformation_6;
	}

	public String getContactDetailsID() {
		return ContactDetailsID;
	}

	public void setContactDetailsID(String contactDetailsID) {
		ContactDetailsID = contactDetailsID;
	}

	public String getContactDetailsDETAIL() {
		return ContactDetailsDETAIL;
	}

	public void setContactDetailsDETAIL(String contactDetailsDETAIL) {
		ContactDetailsDETAIL = contactDetailsDETAIL;
	}

	public String getCodcurr() {
		return codcurr;
	}

	public void setCodcurr(String codcurr) {
		this.codcurr = codcurr;
	}

	public String getRefstan() {
		return refstan;
	}

	public void setRefstan(String refstan) {
		this.refstan = refstan;
	}

	public String getForcedebit() {
		return forcedebit;
	}

	public void setForcedebit(String forcedebit) {
		this.forcedebit = forcedebit;
	}

	public String getTxndesc() {
		return txndesc;
	}

	public void setTxndesc(String txndesc) {
		this.txndesc = txndesc;
	}

	public String getBeneid() {
		return beneid;
	}

	public void setBeneid(String beneid) {
		this.beneid = beneid;
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

	// RTGS
	public String getTxndate() {
		return txndate;
	}

	public void setTxndate(String txndate) {
		this.txndate = txndate;
	}

	public String getCustdet() {
		return custdet;
	}

	public void setCustdet(String custdet) {
		this.custdet = custdet;
	}

	public String getBenefaccountno() {
		return benefaccountno;
	}

	public void setBenefaccountno(String benefaccountno) {
		this.benefaccountno = benefaccountno;
	}

	public String getBenefcustdet() {
		return benefcustdet;
	}

	public void setBenefcustdet(String benefcustdet) {
		this.benefcustdet = benefcustdet;
	}

	public String getCustuniqno() {
		return custuniqno;
	}

	public void setCustuniqno(String custuniqno) {
		this.custuniqno = custuniqno;
	}

	public String getCustdetadd1() {
		return custdetadd1;
	}

	public void setCustdetadd1(String custdetadd1) {
		this.custdetadd1 = custdetadd1;
	}

	public String getCustdetadd2() {
		return custdetadd2;
	}

	public void setCustdetadd2(String custdetadd2) {
		this.custdetadd2 = custdetadd2;
	}

	public String getExchgnam() {
		return exchgnam;
	}

	public void setExchgnam(String exchgnam) {
		this.exchgnam = exchgnam;
	}

	public String getClientrefno() {
		return clientrefno;
	}

	public void setClientrefno(String clientrefno) {
		this.clientrefno = clientrefno;
	}

	public String getPaydetail() {
		return paydetail;
	}

	public void setPaydetail(String paydetail) {
		this.paydetail = paydetail;
	}
	
	

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	
	

	public Float getAccountno() {
		return accountno;
	}

	public void setAccountno(Float accountno) {
		this.accountno = accountno;
	}

	
	
	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	@Override
	public String toString() {
		return "Payment [stanext=" + stanext + ", paymentrefno=" + paymentrefno + ", CustId=" + CustId + ", amount="
				+ amount + ", accountno=" + accountno + ", RemitterName=" + RemitterName + ", RemitterAccount="
				+ RemitterAccount + ", RemitterAccountType=" + RemitterAccountType + ", accounttype=" + accounttype
				+ ", Remitter_Address_1=" + Remitter_Address_1 + ", Remitter_Address_2=" + Remitter_Address_2
				+ ", Remitter_Address_3=" + Remitter_Address_3 + ", Remitter_Address_4=" + Remitter_Address_4
				+ ", BeneIFSCCODE=" + BeneIFSCCODE + ", ifsccode=" + ifsccode + ", BeneAccountType=" + BeneAccountType
				+ ", BeneAccountNumber=" + BeneAccountNumber + ", BeneName=" + BeneName + ", BeneAddress_1="
				+ BeneAddress_1 + ", BeneAddress_2=" + BeneAddress_2 + ", BeneAddress_3=" + BeneAddress_3
				+ ", BeneAddress_4=" + BeneAddress_4 + ", RemitInformation_1=" + RemitInformation_1
				+ ", RemitInformation_2=" + RemitInformation_2 + ", RemitInformation_3=" + RemitInformation_3
				+ ", RemitInformation_4=" + RemitInformation_4 + ", RemitInformation_5=" + RemitInformation_5
				+ ", RemitInformation_6=" + RemitInformation_6 + ", ContactDetailsID=" + ContactDetailsID
				+ ", ContactDetailsDETAIL=" + ContactDetailsDETAIL + ", codcurr=" + codcurr + ", refstan=" + refstan
				+ ", forcedebit=" + forcedebit + ", txndesc=" + txndesc + ", beneid=" + beneid + ", emailid=" + emailid
				+ ", advice1=" + advice1 + ", advice2=" + advice2 + ", advice3=" + advice3 + ", advice4=" + advice4
				+ ", advice5=" + advice5 + ", advice6=" + advice6 + ", advice7=" + advice7 + ", advice8=" + advice8
				+ ", advice9=" + advice9 + ", advice10=" + advice10 + ", addnlfield1=" + addnlfield1 + ", addnlfield2="
				+ addnlfield2 + ", addnlfield3=" + addnlfield3 + ", addnlfield4=" + addnlfield4 + ", addnlfield5="
				+ addnlfield5 + ", txndate=" + txndate + ", custdet=" + custdet + ", benefaccountno=" + benefaccountno
				+ ", benefcustdet=" + benefcustdet + ", custuniqno=" + custuniqno + ", custdetadd1=" + custdetadd1
				+ ", custdetadd2=" + custdetadd2 + ", exchgnam=" + exchgnam + ", clientrefno=" + clientrefno
				+ ", paydetail=" + paydetail + "]";
	}

}
