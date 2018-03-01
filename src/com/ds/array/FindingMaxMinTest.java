package com.ds.array;

import java.util.Arrays;

public class FindingMaxMinTest {

	public static void main(String[] args) {
		int[] arr = {10,2,12,32,34,42,33,22,3,2};
		largestAndSmallest(arr);

	}

	public static void largestAndSmallest(int[] numbers) {
		//int largest = Integer.MIN_VALUE;
		//int smallest = Integer.MAX_VALUE;
		int largest = numbers[0];
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number > largest) {
				largest = number;
			} else if (number < smallest) {
				smallest = number;
			}
		}
		System.out.println("Given integer array : " + Arrays.toString(numbers));
		System.out.println("Largest number in array is : " + largest);
		System.out.println("Smallest number in array is : " + smallest);
	}

}
