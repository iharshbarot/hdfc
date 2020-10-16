package com.util;

import java.util.Random;

public class KeyGenerator {

	private static final int a = 'a';
	private static final int z = 'z';
	private static final int A = 'A';
	private static final int Z = 'Z';
	private static final int ZERO = '0';
	private static final int NINE = '9';



	/**
	 * Generates an alphanumeric random key
	 * @param key size
	 * @return random value
	 */
	public static String generateAlphaNumericKey(int keySize) {
		Random random = new Random();
		StringBuilder key = new StringBuilder();
		while (key.length() < keySize) {
			int ch = random.nextInt(128);
			// is within range
			if ((ch <= Z && ch >= A) || (ch <= z && ch >= a) || (ch <= NINE && ch >= ZERO)) {
				key.append((char) ch);
			}
		}
		return key.toString();
	}

}
