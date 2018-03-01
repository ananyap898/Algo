package com.ds.ch4;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 22, 11, 21, 12, 2, 15, 6, 37 };
		selectinSort(arr, arr.length);
		for (int i : arr) {
			System.out.println(i);
		}

	}

	private static void selectinSort(int[] arr, int length) {

		for (int i = 0; i < length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j; // update the index of minimum element
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}

	}

}
