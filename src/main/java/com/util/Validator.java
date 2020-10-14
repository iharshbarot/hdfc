package com.util;

import com.model.RequestXML;

public class Validator {

	public static String Validate(RequestXML request) {
		// following validation applicable to header node
		if (request.header.getExtsysname().equals("") || request.header.getExtsysname().equals(null)) {

			return AppConstants.ERROR1001;
		}
		if (!request.header.getExtsysname().equals("'COAPI'")) {
			return AppConstants.ERROR1001;
		}
		if (request.header.getDatpost().equals("") || request.header.getDatpost().equals(null)) {
			return AppConstants.ERROR1002;
		}

		return "";

	}

}
