package com.model;

public class RequestXML {
	
	/**
	*(mandatory) This will be a fix value 'COAPI'. Incase any other value(not in list) passed then error will be displayed " Invalid Channel Id".
	*/
	private String extsysname;
	

	/**
	*(mandatory) datpost(yyyy-mm-dd) field received in Request XML from third party system cannot be future date.
	*/
	private String datpost;
	
	
	private String batchnumext;

}
