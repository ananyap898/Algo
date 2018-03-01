package com.ds.ch4;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {10,2,7,3,5};
		bubbleSort(arr);
		
		for(int i : arr){
			System.out.println(i);
		}
		
	}

	private static void bubbleSort(int[] arr) {
		int tmp;
		for(int i=0 ; i < arr.length ; i++){
			
			boolean flag = false;
			
			for(int j = 1 ; j < arr.length ; j++){
				if(arr[j-1] > arr[j]){
					flag = true;
					
					tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
			
			if(!flag){
				return;
			}
		}
		
	}

}
