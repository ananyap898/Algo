package com.src.memoization;

import java.util.HashMap;
import java.util.Map;

public class MemoizationFibonacci {

	private static Map<Integer, Integer> hashMap = new HashMap<>();
	
	public static void main(String[] args) {
		int num = 10;
		for(int i=1 ; i <= num; i++){
			System.out.println(improvedFibo(i));
		}
		
	}
// 1 1 2 3 5 8
	private static int fibo(int num) {
		int a=1,b=1,fibo=1;
		
		if(num == 1 || num == 2){
			return 1;
		}else{
			for(int i=3 ; i<= num; i++){
				fibo = a + b;
				a = b;
				b = fibo;
			}
			return fibo;
			
		}
		
		
	}
	
	public static int improvedFibo(int number){
		if(hashMap.containsKey(number)){
			return hashMap.get(number);
		}
		
		int improvedFibo = fibo(number);
		hashMap.put(number, improvedFibo);
		
		
		return improvedFibo;
		
	}

}
