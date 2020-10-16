package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.model.RequestXML;

public class Validator {

	public static String Validate(RequestXML request) throws ParseException {

		// following validation applicable to header node

		SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
		Date dt1 = objSDF.parse("20-08-1981");
		Date dt2 = objSDF.parse("12-10-2012");

		System.out.println("Date1 : " + objSDF.format(dt1));
		System.out.println("Date2 : " + objSDF.format(dt2));

		if (request.header.getExtsysname().equals("") || request.header.getExtsysname().equals(null)) {

			return AppConstants.ERROR1001;
		}
		if (!request.header.getExtsysname().equals("'COAPI'")) {
			return AppConstants.ERROR1001;
		}
		if (request.header.getDatpost().equals("") || request.header.getDatpost().equals(null)) {
			return AppConstants.ERROR1002;
		}

		if ((dt1.compareTo(dt2) > 0) || (dt1.compareTo(dt2) < 0)) {
			return AppConstants.ERROR1003;
		}
		if (dt1.compareTo(dt2) == 0) {
			return AppConstants.ERROR1004;
		}
		if (request.header.getBatchnumext().equals("") || request.header.getBatchnumext().equals(null)) {
			return AppConstants.ERROR1005;
		}
		if (request.header.getIdtxn().equals("") || request.header.getIdtxn().equals(null)) {
			return AppConstants.ERROR1006;
		}
		if (request.header.getCodcurr().equals("") || request.header.getCodcurr().equals(null)) {
			return AppConstants.ERROR1007;
		}
		if (request.header.getIduser().equals("") || request.header.getIduser().equals(null)) {
			return AppConstants.ERROR1008;
		}
		if (request.header.getIdcust().equals("") || request.header.getIdcust().equals(null)) {
			return AppConstants.ERROR1009;
		}
		if(request.header.getGroupid().equals("")|| request.header.getGroupid().equals(null))
		{
			return AppConstants.ERROR1010;
		}
		if(request.header.getReqdatetime().equals("")|| request.header.getReqdatetime().equals(null))
		{
			return AppConstants.ERROR1011;
		}
		//summary
		
		
		
	
		
		
		
		
		
		
//		stanext and amount validation
		return "";

	}

}
