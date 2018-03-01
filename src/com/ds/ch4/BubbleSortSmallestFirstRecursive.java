package com.ds.ch4;

import java.util.Arrays;

public class BubbleSortSmallestFirstRecursive {

	public static void main(String[] args) {
		int[] arr = { 10, 3, 7, 2, 5 };

		System.out.println("Before Sort--->" + Arrays.toString(arr));

		bubbleSortRecursive(arr, arr.length);// 5

		System.out.println("After Sort--->" + Arrays.toString(arr));
	}

	private static void bubbleSortRecursive(int[] arr, int length) {

		if (length == 1) {
			return;
		}

		for (int j = 0; j < length - 1; j++) {
			if (arr[j + 1] < arr[j]) {
				int tmp = arr[j + 1];
				arr[j + 1] = arr[j];
				arr[j] = tmp;

				bubbleSortRecursive(arr, length - 1);
			}

		}

	}

}
