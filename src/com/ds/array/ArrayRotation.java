package com.ds.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		rotateArray(arr, arr.length, 2);
		for(int i : arr){
			System.out.println(i);
		}
	}

	// Time complexity : rotation * n, SPace : O(1)
	private static void rotateArray(int[] arr, int length, int rotation) {
		
		for(int i=0; i< rotation; i++){
			leftRotateByOne(arr, length);
		}
	}

	private static void leftRotateByOne(int[] arr, int length) {
		int i = 0;
		int temp = arr[0];
		for(int x=0 ; x < length - 1; x++){
			arr[x] = arr[x+1];
		}
		arr[length-1] = temp;
		
	}

}
