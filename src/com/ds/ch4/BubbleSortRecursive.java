package com.ds.ch4;

import java.util.Arrays;

public class BubbleSortRecursive {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 7, 3, 5 };
		System.out.println("Before Sort--->" + Arrays.toString(arr));

		bubbleSort(arr, arr.length);// 5

		System.out.println("After Sort--->" + Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr, int length) {

		if (length == 1) {
			return;
		}

		for (int i = 0; i < length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				// swap arr[i], arr[i+1]
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				
				bubbleSort(arr, length - 1);
			}

			//bubbleSort(arr, length - 1);// 4,3,2,1

		}
	}
}
