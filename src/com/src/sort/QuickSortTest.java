package com.src.sort;

import java.util.Arrays;

public class QuickSortTest {

	public static void main(String[] args) {

		int[] unsorted = { 6, 5, 3, 1, 8, 7, 2, 4 };
		System.out.println("Unsorted array -->" + Arrays.toString(unsorted));

		sort(unsorted);
		System.out.println("Sorted array -->" + Arrays.toString(unsorted));
	}

	private static void sort(int[] arr) {
		if (arr.length == 0) {
			return;
		}
		quickSort(0, arr.length - 1, arr);
	}

	private static void quickSort(int low, int high, int[] input) {
		int i = low;
		int j = high;
		int pivot = input[low + (high - low) / 2];

		while (i <= j) {
			while (input[i] < pivot) {
				i++;
			}
			while (input[j] > pivot) {
				j--;
			}

			if (i <= j) {
				// swap(i,j, input);
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}

		}

		if (low < j) {
			quickSort(low, j, input);
		}

		if (i < high) {
			quickSort(i, high, input);
		}

	}

	private static void swap(int i, int j, int[] input) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;

	}

}
