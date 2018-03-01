package com.princeton.algo;

import java.util.Arrays;

public class MinElementArray {

	public static void main(String[] args) {
		int[] arr = {5,7,3,9,1,8};
		
		System.out.println(Arrays.toString(arr));
		findSmallestAndLargest(arr);

	}

	private static void findSmallestAndLargest(int[] arr) {
		int smallindex = 0;
		int largeIndex = 0;
		
		for(int i=0; i< arr.length; i++){
			if(arr[i] < arr[smallindex]){
				smallindex = i;
			}else if(arr[i] > arr[largeIndex]){
				largeIndex = i;
			}
		}
		
		/*for(int i=0; i< arr.length; i++){
			if(arr[i] > arr[largeIndex]){
				largeIndex = i;
			}
		}*/
		
		System.out.println(arr[smallindex] + ", " + arr[largeIndex]);
		
		
	}

}
