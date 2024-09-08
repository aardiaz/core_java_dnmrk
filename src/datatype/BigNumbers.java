package datatype;

import java.math.BigInteger;

public class BigNumbers {
	
	/*
	 * a> BigInteger
	 * b> BigDecimal
	 */
	public static void main(String[] args) {
		
		BigInteger  a = BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger  b = BigInteger.valueOf(Long.MAX_VALUE);
		
		BigInteger c = a.add(b);
		BigInteger d = a.multiply(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
