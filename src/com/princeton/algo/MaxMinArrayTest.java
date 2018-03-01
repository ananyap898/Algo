package com.princeton.algo;

public class MaxMinArrayTest {

	public static void main(String[] args) {
		int[] arr = {10,1,20,3,34,22,6};
		findMaxMin(arr);

	}

	private static void findMaxMin(int[] arr) {
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1 ; i < arr.length ; i++){
			if(arr[i] >  max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		
		System.out.println("Max = " + max + " Min = " + min);
		
	}

}
