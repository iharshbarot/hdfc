package com.util;

import java.time.LocalDateTime;
import java.util.Random;

public class TransactionNoUtil {

	/**
	 * generates unique transaction no format YYYYMMDD/hhMMss/(nanosecond)/(3 digit
	 * random no) For
	 * 
	 * @param request current request being processed
	 * @return Unique transaction No
	 */

	public static String generateTxnNo() {
		Random rnd = new Random();
		LocalDateTime dt = LocalDateTime.now();
		return new StringBuilder().append(dt.getYear()).append(dt.getMonthValue()).append(dt.getDayOfMonth())
				.append("/").append(dt.getHour()).append(dt.getMinute()).append(dt.getSecond()).append("/")
				.append(Integer.toString(dt.getNano()).substring(0, 6)).append("/").append(rnd.nextInt(1000))
				.toString();

	}
}
