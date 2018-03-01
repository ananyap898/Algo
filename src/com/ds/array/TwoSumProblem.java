package com.ds.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//http://blog.gainlo.co/index.php/2016/07/19/3sum/
public class TwoSumProblem {

	public static void main(String[] args) {
		int total = 9;
		Integer[] S = { 1, 4, 7, 2, 3, 4, 6,5,5 };
		method1(total, S);
		//method2(total,S);

	}
	//O(nlogn)
	private static void method2(int sum, Integer[] a) {
		if(a == null || a.length < 2){
			return;
		}
		
		int left = 0;
		int right = a.length - 1;
		java.util.Arrays.sort(a);
		while(left < right){
			int i = a[left];
			int j = a[right];
			if(i+j == sum){
				System.out.println("The pair is "+i+" and "+j);
				left++;
				right--;
			}else if(i+j > sum){
				right--;
			}else{
				left++;
			}
		}
		
	}
	
	//O(n)
	private static void method1(int total, Integer[] S) {
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(S));
		for (int i : set){
			if (set.contains(total - i)){
				System.out.println(i + " + " + (total - i) + " = " + total);
			}
		}
	}

}
