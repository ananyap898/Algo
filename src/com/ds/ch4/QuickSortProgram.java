package com.ds.ch4;

public class QuickSortProgram {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };
		
		int start = 0;
		int end = arr.length - 1;
		quickSort(arr, start, end);
		for (int i : arr) {
			System.out.print(" " + i);
		}
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pIndex = partition(arr, start, end);
			System.out.println("Partition created at index- "+ pIndex);
			quickSort(arr, start, pIndex - 1);
			quickSort(arr, pIndex + 1, end);
		}
	}

	private static int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int pIndex = start;

		for (int i = start; i <= end - 1; i++) {
			if (arr[i] <= pivot) {
				//swap arr[i] and arr[pIndex]
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				
				//increment pIndex index
				pIndex = pIndex + 1;
			}
		}
		//swap arr[pIndex] and arr[end],which has pivot.
		int temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;

		return pIndex;
	}
	
	

}
