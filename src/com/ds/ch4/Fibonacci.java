package com.ds.ch4;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter n :");
			long n = scanner.nextLong();
			if (n >= 0) {
				long beginTime = System.currentTimeMillis();
				long fibo = getFibonacciOf(n);
				long endTime = System.currentTimeMillis();

				long delta = endTime - beginTime;

				System.out.println("F(" + n + ") = " + fibo + " ... computed     in " + delta + " milliseconds");
			} else {
				break;

			}
		}

	}

	public static long getFibonacciOf(long n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return getFibonacciOf(n - 2) + getFibonacciOf(n - 1);
		}
	}

}
