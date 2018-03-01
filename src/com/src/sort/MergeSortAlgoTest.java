package com.src.sort;

import java.util.Arrays;

public class MergeSortAlgoTest {

	public static void main(String[] args) {
		MergeSortAlgo algo = new MergeSortAlgo();
		int[] unsorted = {6,5,3,1,8,7,2,4};
		System.out.println("Unsorted array -->" + Arrays.toString(unsorted));
		
		algo.sort(unsorted);
		System.out.println("Sorted array -->" + Arrays.toString(unsorted));
	}

}
