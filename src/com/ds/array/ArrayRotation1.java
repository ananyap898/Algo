package com.ds.array;

import java.util.Arrays;

public class ArrayRotation1 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		rotateArray(arr, arr.length, 2);
		for(int i : arr){
			System.out.println(i);
		}

	}

	// Time complexity : O(n), space : O(d)
	private static void rotateArray(int[] arr, int length, int rotation) {
		int[] tmp = Arrays.copyOf(arr, 2);
		
		for(int i=0 ; i< length - 2; i++){
			arr[i] = arr[i+1];
		}
		arr[length-2] = tmp[0];
		arr[length-1] = tmp[1];
		
	}

}
