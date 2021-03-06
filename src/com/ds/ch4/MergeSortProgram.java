package com.ds.ch4;

public class MergeSortProgram {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };
		mergeSort(arr);
		for (int i : arr) {
			System.out.print(" " + i);
		}

	}

	private static void mergeSort(int[] arr) {
		int n = arr.length;
		// return if array has zero or one element.
		if (n < 2) {
			return;
		}
		// find the middle
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];

		// populate the left array 0...mid
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}

		// populate the right array mid...end
		for (int i = mid; i < n; i++) {
			right[i - mid] = arr[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);

	}

	private static void merge(int[] left, int[] right, int[] arr) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) { 
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			//increment the index of the result array.
			k = k + 1;
		}
		
		// copy left over elements in left array into the array
		while (i < left.length) {
			arr[k] = left[i];
			k++;
			i++;
		}

		// copy left over elements in right array into the array
		while (j < right.length) {
			arr[k] = right[j];
			k++;
			j++;
		}

	}

}
