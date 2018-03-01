package com.ds.ch4;

public class MaximumTest {

	public static void main(String[] args) {
		int[] arr = {1,4,2,7,56,76,32,12,21,13,4};
		int max = maximumInAnAray(arr);
		System.out.println("Max-->" + max);
		
		int min = minimumInAnArray(arr);
		System.out.println("Min-->" + min);
	}

	private static int minimumInAnArray(int[] arr) {
		int min = arr[0];
		for(int i=1; i< arr.length ; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}

	private static int maximumInAnAray(int[] arr) {
		if(arr.length == 0){
			return 0;
		}
		
		int max = arr[0];
		for(int i=1; i< arr.length ; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}

}
