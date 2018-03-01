package com.src.memoization;

public class MemoizatinPrime {

	public static void main(String[] args) {
		for (int i = 2; i <= 25; i++) {
			System.out.println("is " + i + " prime --? " + prime(i));
		}
	}

	public static boolean prime(int num) {

		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i < Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
