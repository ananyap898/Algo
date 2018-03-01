package com.ds.ch4;

public class CountNoZeros {

	public static void main(String[] args) {
		CountNoZeros count = new CountNoZeros();
		int arr[] = { 0, 0, 0, 0, 0, 0, 1, 1, 1 };
		int n = arr.length;
		System.out.println("Count of Zeros is " + count.countZeroes(arr, n));
	}

	
	int firstOne(int arr[], int low, int high) {
		if (high >= low) {
			// Check if mid element is first 1
			int mid = low + (high - low) / 2;
			if ((mid == 0 || arr[mid - 1] == 0) && arr[mid] == 1)
				return mid;

			if (arr[mid] == 0) // If mid element is not 1
				return firstOne(arr, (mid + 1), high);
			else // If mid element is 1, but not first 1
				return firstOne(arr, low, (mid - 1));
		}
		return -1;
	}

	// A wrapper over recursive function firstZero()
	int countZeroes(int arr[], int n) {
		// Find index of first one in given array
		int first = firstOne(arr, 0, n-1 );

		return first; // number of Zeros

		// return (n - first); // number of Ones
	}

}
