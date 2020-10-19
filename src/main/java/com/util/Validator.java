//package com.util;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import com.model.RequestXML;
//import com.model.Summary;
//
//public class Validator {
//
//	public static String Validate(RequestXML request) throws ParseException {
//
//		// following validation applicable to header node
//
//		SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
//		Date dt1 = objSDF.parse("20-08-1981");
//		Date dt2 = objSDF.parse("12-10-2012");
//
//		System.out.println("Date1 : " + objSDF.format(dt1));
//		System.out.println("Date2 : " + objSDF.format(dt2));
//
//		if (request.header.getExtsysname().equals("") || request.header.getExtsysname().equals(null)) {
//
//			return AppConstants.ERROR1001;
//		}
//		if (!request.header.getExtsysname().equals("'COAPI'")) {
//			return AppConstants.ERROR1001;
//		}
//		if (request.header.getDatpost().equals("") || request.header.getDatpost().equals(null)) {
//			return AppConstants.ERROR1002;
//		}
//
//		if ((dt1.compareTo(dt2) > 0) || (dt1.compareTo(dt2) < 0)) {
//			return AppConstants.ERROR1003;
//		}
//		if (dt1.compareTo(dt2) == 0) {
//			return AppConstants.ERROR1004;
//		}
//		if (request.header.getBatchnumext().equals("") || request.header.getBatchnumext().equals(null)) {
//			return AppConstants.ERROR1005;
//		}
//		if (request.header.getIdtxn().equals("") || request.header.getIdtxn().equals(null)) {
//			return AppConstants.ERROR1006;
//		}
//		if (request.header.getCodcurr().equals("") || request.header.getCodcurr().equals(null)) {
//			return AppConstants.ERROR1007;
//		}
//		if (request.header.getIduser().equals("") || request.header.getIduser().equals(null)) {
//			return AppConstants.ERROR1008;
//		}
//		if (request.header.getIdcust().equals("") || request.header.getIdcust().equals(null)) {
//			return AppConstants.ERROR1009;
//		}
//		if (request.header.getGroupid().equals("") || request.header.getGroupid().equals(null)) {
//			return AppConstants.ERROR1010;
//		}
//		if (request.header.getReqdatetime().equals("") || request.header.getReqdatetime().equals(null)) {
//			return AppConstants.ERROR1011;
//		}
//		// Summaary
//		if (String.valueOf(request.summary.getOrgcountdr()).equals("")
//				|| String.valueOf(request.summary.getOrgcountdr()).equals(null)) {
//			return AppConstants.ERROR1012;
//		}
//		if (String.valueOf(request.summary.getOrgsumcr()).equals("")
//				|| String.valueOf(request.summary.getOrgcountcr()).equals(null)) {
//			return AppConstants.ERROR1013;
//		}
//		if (String.valueOf(request.summary.getOrgsumdr()).equals("")
//				|| String.valueOf(request.summary.getOrgsumdr()).equals(null)) {
//			return AppConstants.ERROR1014;
//		}
//		if (String.valueOf(request.summary.getOrgsumcr()).equals("")
//				|| String.valueOf(request.summary.getOrgsumcr()).equals(null)) {
//			return AppConstants.ERROR1015;
//		}
//		if (request.debit.getStanext().equals("") || request.debit.getStanext().equals(null)) {
//			return AppConstants.ERROR1016;
//		}
//		if (request.debit.getAccountno().equals("") || request.debit.getAccountno().equals(null)) {
//			return AppConstants.ERROR1017;
//		}
//		if (String.valueOf(request.creditlist.cridit.getAmount()).equals("")
//				|| String.valueOf(request.creditlist.cridit).equals(null)) {
//			return AppConstants.ERROR1018;
//		}
//		if (request.debit.getTxndesc().equals("") || request.debit.getTxndesc().equals(null)) {
//			return AppConstants.ERROR1019;
//		}
//		if (request.debit.getReferenceno().equals("") || request.debit.getReferenceno().equals(null)) {
//			return AppConstants.ERROR1020;
//		}
//		if (request.credit.getBeneid().equals("") || request.credit.getBeneid().equals(null)) {
//			return AppConstants.ERROR1021;
//		}
//		if (request.credit.getBeneName().equals("") || request.credit.getBeneName().equals(null)) {
//			return AppConstants.ERROR1022;
//		}
//		if (request.credit.getBeneAddress_1().equals("") || request.credit.getBeneAddress_1().equals(null)) {
//			return AppConstants.ERROR1023;
//		}
//		if (request.credit.getBeneAddress_2().equals("") || request.credit.getBeneAddress_2().equals(null)) {
//			return AppConstants.ERROR1024;
//		}
//		if (request.credit.getBeneAddress_3().equals("") || request.credit.getBeneAddress_3().equals(null)) {
//			return AppConstants.ERROR1025;
//		}
//		if (request.credit.getBeneAddress_4().equals("") || request.credit.getBeneAddress_4().equals(null)) {
//			return AppConstants.ERROR1026;
//		}
//		if (request.credit.getEmailid().equals("") || request.credit.getEmailid().equals(null)) {
//			return AppConstants.ERROR1027;
//		}
//		if (request.credit.getAdvice1().equals("") || request.credit.getAdvice1().equals(null)) {
//			return AppConstants.ERROR1028;
//		}
//		if (request.credit.getAdvice2().equals("") || request.credit.getAdvice2().equals(null)) {
//			return AppConstants.ERROR1029;
//		}
//		if (request.credit.getAdvice3().equals("") || request.credit.getAdvice3().equals(null)) {
//			return AppConstants.ERROR1030;
//		}
//		if (request.credit.getAdvice4().equals("") || request.credit.getAdvice4().equals(null)) {
//			return AppConstants.ERROR1031;
//		}
//		if (request.credit.getAdvice5().equals("") || request.credit.getAdvice5().equals(null)) {
//			return AppConstants.ERROR1032;
//		}
//		if (request.credit.getAdvice6().equals("") || request.credit.getAdvice6().equals(null)) {
//			return AppConstants.ERROR1033;
//		}
//		if (request.credit.getAdvice7().equals("") || request.credit.getAdvice7().equals(null)) {
//			return AppConstants.ERROR1034;
//		}
//		if (request.credit.getAdvice8().equals("") || request.credit.getAdvice8().equals(null)) {
//			return AppConstants.ERROR1035;
//		}
//		if (request.credit.getAdvice9().equals("") || request.credit.getAdvice9().equals(null)) {
//			return AppConstants.ERROR1036;
//		}
//		if (request.credit.getAdvice10().equals("") || request.credit.getAdvice10().equals(null)) {
//			return AppConstants.ERROR1037;
//		}
//
//	}
//
//}
