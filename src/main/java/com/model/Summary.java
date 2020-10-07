package com.model;

public class Summary {

	/**
	*(not-mandatory) This has to be 1. (Num 2)
	*/
	private short orgcountdr;
	
	/**
	*(not-mandatory) this can be min 1 to max 10. (Num 2)
	*/
	private short orgcountcr;
	
	/**
	*(not-mandatory) sumdr and sumcr should match.FLOAT(13,2)
	*/
	private float orgsumdr;
	
	/**
	*(not-mandatory) sumcr should match with the total of the cr in credit tags.FLOAT(13,2)
	*/
	private float orgsumcr;

	public short getOrgcountdr() {
		return orgcountdr;
	}

	public void setOrgcountdr(short orgcountdr) {
		this.orgcountdr = orgcountdr;
	}

	public short getOrgcountcr() {
		return orgcountcr;
	}

	public void setOrgcountcr(short orgcountcr) {
		this.orgcountcr = orgcountcr;
	}

	public float getOrgsumdr() {
		return orgsumdr;
	}

	public void setOrgsumdr(float orgsumdr) {
		this.orgsumdr = orgsumdr;
	}

	public float getOrgsumcr() {
		return orgsumcr;
	}

	public void setOrgsumcr(float orgsumcr) {
		this.orgsumcr = orgsumcr;
	}

	@Override
	public String toString() {
		return "Summary [orgcountdr=" + orgcountdr + ", orgcountcr=" + orgcountcr + ", orgsumdr=" + orgsumdr
				+ ", orgsumcr=" + orgsumcr + "]";
	}
	
	
}
