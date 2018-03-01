package com.ds.array;

import java.util.HashSet;
import java.util.Set;

public class PairOfNumbersTest {

	public static void main(String[] args) {
		int[] arr = {2,5,7,1,6,-3,10,11};
		findPairs(arr, 7);

	}

	private static void findPairs(int[] arr, int sum) {
		Set<Integer> hashSet = new HashSet<>();
		for(int i : arr){
			int requiredValue = sum - i;
			if(!hashSet.contains(requiredValue)){
				hashSet.add(i);
			}else{
				System.out.println("Pairs -->" + i + " , "+ requiredValue );
			}
			
			
		}
		
		
	}

}
