package com.ds.array;

public class SubArraysinAnArray {

	public static void main(String[] args) {
		int [] nums = {1, 2, 3};
        subArrays(nums);
	}

	private static void subArrays(int[] nums) {
	
		for(int i=0; i< nums.length; i++){
			for(int groupSize = i; groupSize <= nums.length; groupSize++){
				for(int j = i; j < groupSize; j++ ){
					System.out.print(nums[j] + " ");
				}
				System.out.println();
			}
		}
	}

}
