package com.ds.array;

public class CountOnes {

	public static void main(String[] args) {
		int arr[] = { 0, 0,0,1,1,1,1,1,1};
		int pos = countOne(arr,0,arr.length-1);
		System.out.println(pos);
	}

	private static int countOne(int[] arr, int low, int high) {
		
		
		while(low <= high){
			int mid = (low + high)/2;
			if(arr[mid] == 1 && (arr[mid - 1] == 0)){
				return arr.length - mid;
			}else if(arr[mid] == 0){
				return countOne(arr, mid+1, high);
			}else{
				return countOne(arr, low, mid-1);
			}
		}
		
		return 0;
	}

}
