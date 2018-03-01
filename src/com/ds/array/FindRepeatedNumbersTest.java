package com.ds.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindRepeatedNumbersTest {

	public static void main(String[] args) {
		int[] arr = {2,5,7,1,2,5,10,6,-3,10,11};
		//findRepepatedNumbers(arr);
		firstNonRepeatedCharacter("ananyan");

	}

	private static void firstNonRepeatedCharacter(String s) {
		Map<Character, Integer> hashMap = new LinkedHashMap<>();
		int count = 1;
		for(char c : s.toCharArray()){
			if(!hashMap.containsKey(c)){
				hashMap.put(c,1);
			}else{
				hashMap.put(c,hashMap.get(c)+1);
			}
			//hashMap.put(c, hashMap.containsKey(c) ? 1 : hashMap.get(c)+1);
		}
		
		for(char key : hashMap.keySet()){
			if(hashMap.get(key) == 1){
				System.out.println(key);
			}
		}
	}

	private static void findRepepatedNumbers(int[] arr) {
	
		Map<Integer, Integer> hashMap = new HashMap<>();
		for(int n : arr){
			if(!hashMap.containsKey(n)){
				hashMap.put(n, 1);
			}else{
				System.out.println(n + "  is repeated.");
			}
		}
		
		
		
	}

}
