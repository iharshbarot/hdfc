package com.model;

public class RequestJason {

	/**
	 * The original REST-XML request needs to be digitally signed using RSA SHA 256,
	 * and then symmetrically encrypted, using a random string of 32 bytes (256
	 * bits), for the value of this field.
	 */
	private String requestSignatureEncryptedValue;

	/**
	 * This will contain asymmetrically encrypted value of the Key, earlier used for
	 * symmetric key encryption of request for the first tag.
	 */
	private String symmetricKeyEncryptedValue;

	/**
	 * This contains the scope value (which was set on the HDFC Bank’s API portal
	 * while registering the consumer application). It will get validated against
	 * the corresponding apikey (which can be obtained from the HDFC Bank’s API
	 * portal after successfully registering the consumer application) sent in the
	 * request header.
	 */
	private String scope;

	/**
	 * Set a unique transaction ID every-time for identifying the request, in order
	 * to retrieve it from an audit trail.
	 */
	private String transactionId;

	/**
	 * This value can be obtained by invoking HDFC token generator service.
	 */
	private String oAuthTokenValue;

	public String getRequestSignatureEncryptedValue() {
		return requestSignatureEncryptedValue;
	}

	public void setRequestSignatureEncryptedValue(String requestSignatureEncryptedValue) {
		this.requestSignatureEncryptedValue = requestSignatureEncryptedValue;
	}

	public String getSymmetricKeyEncryptedValue() {
		return symmetricKeyEncryptedValue;
	}

	public void setSymmetricKeyEncryptedValue(String symmetricKeyEncryptedValue) {
		this.symmetricKeyEncryptedValue = symmetricKeyEncryptedValue;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getoAuthTokenValue() {
		return oAuthTokenValue;
	}

	public void setoAuthTokenValue(String oAuthTokenValue) {
		this.oAuthTokenValue = oAuthTokenValue;
	}

	@Override
	public String toString() {
		return "RequestJason [requestSignatureEncryptedValue=" + requestSignatureEncryptedValue
				+ ", symmetricKeyEncryptedValue=" + symmetricKeyEncryptedValue + ", scope=" + scope + ", transactionId="
				+ transactionId + ", oAuthTokenValue=" + oAuthTokenValue + "]";
	}

}
