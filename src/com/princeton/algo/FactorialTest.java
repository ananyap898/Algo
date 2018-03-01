package com.princeton.algo;

import java.math.BigInteger;

public class FactorialTest {

	public static void main(String[] args) {
		int num = 5;
		System.out.println("Factorial Value of "+ num + "=" + fact(num));

	}
	
	/*private static int fact(int num) {
		if(num != 1){
			num *= fact(num - 1);
		}
		System.out.println(num);
		return num;
	}*/
	
	/*private static int fact(int num) {
		int total = 1;
		for(int i=1 ; i <= num ; i++){
			total *=  i;
		}
		
		System.out.println(total);
		return total;
	}*/
	
	private static BigInteger fact(int num) {
		BigInteger factValue = BigInteger.ONE;
		for(int i=2 ; i <= num; i++){
			factValue = factValue.multiply(BigInteger.valueOf(i));
		}
		
		return factValue;
	}

}
