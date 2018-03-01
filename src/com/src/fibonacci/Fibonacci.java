package com.src.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static int fibonacci(int num) {

		if (num == 1 || num == 2) {
			return 1;
		}

		if (map.containsKey(num)) {
			return map.get(num);
		}

		int a, b;

		if (map.containsKey(num - 1))
			a = map.get(num - 1);
		else {
			a = fibonacci(num - 1);
			map.put(num - 1, a);
		}
		
		if (map.containsKey(num - 2))
			b = map.get(num - 2);
		else {
			b = fibonacci(num - 2);
			map.put(num - 2, b);
		}

		return a + b;
	}
}
