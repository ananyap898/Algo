package com.ds.array;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = { 0, 2, 3,40, 50, 70, 80, 100};
		int pos = binarySearch(arr, 80);
		System.out.println(pos);
	}

	private static int binarySearch(int[] arr, int num) {
	
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high){
			int mid = (low+high)/2;
			if(arr[mid] == num){
				return mid;
			}else if(arr[mid] < num){
				low = mid + 1;
			}else if(arr[mid] > num){
				high = mid - 1;
			}
		}
		
		
		return -1;
	}

}
