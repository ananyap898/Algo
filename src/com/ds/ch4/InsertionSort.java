package com.ds.ch4;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {10,2,7,3,5};
		insertionSort(arr);
		
		for(int i : arr){
			System.out.println(i);
		}
		
		
	}

	private static void insertionSort(int[] arr) {
		int j = 0;
		for(int i=1; i < arr.length ; i++){
			 j = i;
			while(j > 0 && (arr[j] < arr[j-1])){
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				
				j = j - 1;
			}
		}
		
	}

}
