package com.ds.ch4;

import java.util.Arrays;

public class BubbleSortSmallestFirstNonRecursive {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 7, 3, 5 };

		System.out.println("Before Sort--->" + Arrays.toString(arr));

		bubbleSort(arr, arr.length);// 5

		System.out.println("After Sort--->" + Arrays.toString(arr));

	}

	private static void bubbleSort(int[] arr, int n) {

		for (int i = 0; i <= n - 2; i++) {
			for (int j = n - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}

	}

}
