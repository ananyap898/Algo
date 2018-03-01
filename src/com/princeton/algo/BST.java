package com.princeton.algo;

public class BST {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int a = binarySearch(arr,1);
		System.out.println(a);

	}
	
	public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

}
