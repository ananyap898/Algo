package com.princeton.algo;

import java.util.Arrays;

import javax.naming.ldap.SortControl;

public class SelectionSortTest {

	public static void main(String[] args) {
		int[] unsortedArray = { 2, 34, 4, 56, 1, 98 };
		System.out.println(Arrays.toString(unsortedArray));
		sort(unsortedArray);

	}

	public static void sort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < data[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = data[minIndex];
			data[minIndex] = data[i];
			data[i] = tmp;
		}
		System.out.println(Arrays.toString(data));
	}

}
