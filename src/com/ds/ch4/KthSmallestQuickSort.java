package com.ds.ch4;

/**
 * In this tech­nique we select a pivot ele­ment and after a one round of
 * oper­a­tion the pivot ele­ment takes its cor­rect place in the array. Once
 * that is done we check if the pivot ele­ment is the kth ele­ment in array, if
 * yes then return it. But if pivot ele­ment is less than the kth ele­ment, that
 * clearly means that the kth ele­ment is on the right side of the pivot. So
 * make a recur­sive call from pivot+1 to end. Sim­i­larly if pivot ele­ment is
 * greater than the kth ele­ment, that clearly means that the kth ele­ment is on
 * the left side of the pivot. So make a recur­sive call from start to pivot-1.
 * Average Time complexity : O(n)
 * 
 * @author ananyap
 *
 */

public class KthSmallestQuickSort {

	// variable comparison counter
	private long compCount = 0;

	public void sort(int[] arr, int size) {
		long start_time = System.currentTimeMillis();
		int k = 4;
		int kthSmallest = findkthSmallestElement(arr, k);
		long end_time = System.currentTimeMillis();
		long total = end_time - start_time;

		System.out.println("Algorithm MergeSort: " + size + "; " + k + " ; " + kthSmallest + ", "
				+ "Number of key-comparision: " + compCount + "  (Total Time Taken: " + total + " ms......");
	}

	
	public static int findkthSmallestElement(int[] arrA, int k) {
		k = k - 1; // since array index starts with 0
		return kthSmallestElement(arrA, 0, arrA.length - 1, k);
	}

	public static int kthSmallestElement(int[] arrA, int start, int end, int k) {
		int left = start;
		int right = end;
		int pivot = start;
		while (left <= right) {
			while (left <= right && arrA[left] <= arrA[pivot])
				left++;
			while (left <= right && arrA[right] >= arrA[pivot])
				right--;
			if (left < right) {
				swap(arrA, left, right);
				left++;
				right--;
			}
		}
		swap(arrA, pivot, right);
		if (pivot == k)
			return arrA[pivot];// if pivot is kth element , return
		else if (pivot < k)
			// if pivot is less than k, then kth element will be on the right
			return kthSmallestElement(arrA, pivot + 1, end, k);
		else
			// if pivot is greater than k, then kth element will be on the right
			return kthSmallestElement(arrA, start, pivot - 1, k);
	}

	public static void swap(int[] arrA, int a, int b) {
		int x = arrA[a];
		arrA[a] = arrA[b];
		arrA[b] = x;
	}

}