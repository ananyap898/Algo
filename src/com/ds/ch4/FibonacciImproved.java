package com.ds.ch4;

import java.util.HashMap;
import java.util.Scanner;

public class FibonacciImproved {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter n :");
			Integer n = scanner.nextInt();
			if (n >= 0) {
				long beginTime = System.currentTimeMillis();
				Integer fibo = getFibonacciOf(n);
				long endTime = System.currentTimeMillis();

				long delta = endTime - beginTime;

				System.out.println("F(" + n + ") = " + fibo + " ... computed     in " + delta + " milliseconds");
			} else {
				break;

			}
		}
	}

	public static Integer getFibonacciOf(Integer n) {

	//	Integer num = 0;
		 HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();


		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			if (cache.containsKey(n)) {
				cache.get(n);
			} else {
				Integer num = getFibonacciOf(n - 2) + getFibonacciOf(n - 1);
				cache.put(n, num);
				return num;
			}
		}
		return 0;
	}

}
