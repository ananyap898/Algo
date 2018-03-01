package com.src.quickselect;

public class QuickSelect {
	public static void main(String[] args) {
		final int[] list = new int[] { 1, 2, 11, 16, 34, 3, 4, 42, 5, 6, 28, 7, 8, 9, 10 }; // n = 1...15
		QuickSelect qs = new QuickSelect();
		final int k = 4;
		final int kthMinIndex = qs.findKthMinimum(list, k - 1);
		System.out.println("[");
		for (int i = 0; i <= kthMinIndex; i++)
			System.out.print(list[i] + " ");
		System.out.print("]");

	}

	public int findKthMinimum(final int[] list, final int k) {
		if (k > list.length || k < 1) {
			throw new IllegalArgumentException("Bad arguments.");
		}
		final int left = 0;
		final int right = list.length - 1;
		final int pivot = (int) Math.floor((double) left + (Math.random() * (double) (right - left)));
		final int result = findKthMinimum(list, left, right, k, pivot);
		return result;
	}

	private int findKthMinimum(final int[] list, int left, int right, final int k, int pivot) {
		int partitionElement = partition(list, left, right, pivot);
		while (left != right) {
			if (partitionElement == k)
				break;
			else if (partitionElement > k) {
				right = partitionElement - 1;
				pivot = (int) Math.floor((double) left + (Math.random() * (double) (right - left)));
			} else if (partitionElement < k) {
				left = partitionElement + 1;
				pivot = (int) Math.floor((double) left + (Math.random() * (double) (right - left)));
			}
			partitionElement = partition(list, left, right, pivot);
		}
		return list[partitionElement];
	}

	private int partition(final int[] list, int left, int right, int pivot) {
		final int pivotElement = list[pivot];
		swap(list, pivot, right);
		int lastStoredIndex = left;
		for (int i = left; i < right; i++) {
			if (list[i] < pivotElement) {
				swap(list, i, lastStoredIndex++);
			}
		}
		swap(list, lastStoredIndex, right);
		return lastStoredIndex;
	}

	private void swap(final int[] list, final int first, final int second) {
		final int temp = list[first];
		list[first] = list[second];
		list[second] = temp;
	}

}
