package com.princeton.algo;

import java.util.Arrays;

public class BinarySearchTest {
	static int count = 0;

	public static void main(String[] args) {

		// int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 15 };

		// int arr[] = { 0,0,0,0,0,0,0,1,1,1,1,1 };

		/*
		 * boolean isFound = binarySearch(4 , arr); System.out.println(
		 * "Is Found :"+ isFound);
		 */

		BinarySearchTest ob = new BinarySearchTest();
		int arr[] = { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
		int n = arr.length;
		int x = 0;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	private static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the middle itself
			if (arr[mid] == x){
				count += 1;
				System.out.println("count:"+count);
				return mid;
			}
			// If element is smaller than mid, then it can only
			// be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present in right
			// subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		
		// We reach here when element is not present in array
		return -1;
	}

	private static boolean binarySearch(int numToSearch, int[] arr) {
		int low = 0;
		int high = arr.length - 1;

		boolean isFound = false;

		while (low <= high) {
			// int mid = (low + high) >>> 1;
			int mid = low + (high - low) / 2;
			if (arr[mid] == numToSearch) {
				isFound = true;
				break;
			}
			if (arr[mid] > numToSearch) {
				high = mid - 1;

			} else if (arr[mid] < numToSearch) {
				low = mid + 1;

			}

		}

		return isFound;
	}

}
