package com.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {

	public static void main(String[] args) {
		int[] a = { 1, 3, 7, 8, 3, 9, 2, 4, 10 };
		List<List<Integer>> triplets;
		// triplets=sumOfThreeNaive(a, 13);
		triplets = sumOfThree(a, 13);
		for(List<Integer> list1 : triplets){
			for(int i : list1){
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	private static List<List<Integer>> sumOfThree(int[] arr, int sum) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		int j,k;
		
		for(int i=0; i< arr.length-2; i++){
			j = i+1;
			k = arr.length - 1;
			while(j < k){
				if(arr[i] + arr[j] + arr[k] == sum){
					list.add(Arrays.asList(arr[i],arr[j],arr[k]));
					j++;
				}else if(arr[i] + arr[j] + arr[k] < sum){
					j++;
				}else{
					k--;
				}
			}
			
		}
		
		return list;
	}

}
