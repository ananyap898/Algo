package com.ds.ch4;

/**
 * K smallest element using Bubble Sort. Restrict Outer loop to execute k times.
 * O(nk)
 * 
 * @author meethunpanda
 *
 */
public class BubbleSortKthSmallest {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 7, 3, 5, 11, 27, 36, 47, 58, 59, 97, 22, 33, 44, 55 };

		int k = 5;
		bubbleSort(arr, arr.length, k);

		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void bubbleSort(int[] arr, int n, int k) {
		int i, j;
		for (i = 0; i < k; i++)
			for (j = n - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
	}

}
