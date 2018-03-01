package com.ds.array;

/**
 * Objective: Given an array and integer k, 
 * write an algorithm to find the maximum element in each subarray of size k.
 * @author meethunpanda
 *
 */
public class SlidingWindowProblem {

	public static void main(String[] args) {
		int [] nums = {1, 2, 3, 2, 4, 1, 5, 6, 1};
        int k = 3;
        slidingWindow(nums, k);
	}

	private static void slidingWindow(int[] nums, int k) {

		for(int i=0 ; i< nums.length - k; i++){
			int max = nums[i];
			
			for(int j= 1; j< k; j++){
				if(nums[i+j] > max){
					max = nums[i+j];
				}
			}
			System.out.println(max);
		}
		
	}

}
