package com.ds.ch4;

import java.util.PriorityQueue;

public class KNearlySorted {

	public static void main(String[] args) {
		int[] arr = {8,1,2,7,3,4,5,6};
		sortNearlySorted(arr,2);
		for(int i : arr){
			System.out.println(i);
		}
	}
	
	
	public static void sortNearlySorted(int[] nums, int k) {
		  PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		  for (int i = 0; i < k; i++) {
		    minHeap.add(nums[i]);
		  }

		  for (int i = 0; i < nums.length; i++) {
		    if (i + k < nums.length) {
		      minHeap.add(nums[i + k]);
		    }
		    nums[i] = minHeap.remove();
		  }
		}


}
