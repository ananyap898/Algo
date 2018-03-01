package com.ds.ch4;

public class PowersNumberTest {

	public static void main(String[] args) {
		double result = power(2, -7);
		System.out.println(result);
	}
	// Approach - 1

	/*
	 * public static int power(int x, int n) { if (n == 0) { return 1; } if (n <
	 * 0) { return 1 / (power(x, Math.abs(n))); } return x * power(x, n - 1); }
	 */

	// Approach - 2

	public static double power(int x, int n) {
		// Base condition
		if (n == 0) {
			return 1d;
		}

		double partial = power(x, (Math.abs(n)/2) );
		double result = partial * partial;

		if (n < 0) {
			if (n % 2 == -1) { // n is negative and odd
				return 1 / (result * x);
			} else if (n % 2 == 0) { // n is negative and even
				return 1 / (result);
			} 
		}else {
				// For odd, we have to mltiply x;
				if (n % 2 == 1) {
					result = result * x;
				}
			}
		return result;
	}
}
