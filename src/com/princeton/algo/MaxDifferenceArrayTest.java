package com.princeton.algo;

public class MaxDifferenceArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,7,2,4,6,8,18};
		findMaxDifference(arr);
	}

	private static void findMaxDifference(int[] arr) {
		int max = 0;
		for(int i=0 ; i< arr.length ; i++){
			for(int j=0 ; j < arr.length; j++){
				if(arr[i] - arr[j] > max){
					max = arr[i] - arr[j];
				}
			}
		}
		System.out.println("Maximum Difference--" + max);
		
	}

}
