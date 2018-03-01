package com.src.memoization;

import java.util.HashMap;
import java.util.Map;

public class MemoizationFactorial {

	private static Map<Integer, Integer> cache = new HashMap<>();
	
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

	private static int fact(int num) {
		int result = 1;
		while(num != 0){
			result = result * num;
			num = num-1;
		}
		return result;
	/*	if(cache.containsKey(num)){
			return cache.get(num);
		}
		int factorial = num * (num-1);
		cache.put(num, factorial);
		return factorial;*/
	}

}
