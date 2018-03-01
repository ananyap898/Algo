package com.ds.ch4;

public class ReverseArrayTest {

	public static void main(String[] args) {
		int[] arr = {10,2,7,3,5,6};
		int[] reverseArray = reverseArray(arr);
		
		for(int i : reverseArray){
			System.out.println(i);
		}

	}

	private static int[] reverseArray(int[] arr) {
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low < high){
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low ++;
			high --;
		}
		
		return arr;
		
	}

}
