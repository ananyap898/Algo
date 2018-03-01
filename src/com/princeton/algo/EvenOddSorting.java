package com.princeton.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EvenOddSorting {

	public static void main(String[] args) {
		
		int[] arr = {9,11,23,45,1,3,4,5,56,67,78};
		sortByEvenOdd(arr);

	}

	private static void sortByEvenOdd(int[] arr) {
		
		List<Integer> evenList = new LinkedList<>();
		List<Integer> oddList = new LinkedList<>();
		
		for(int i=0; i<arr.length; i++){
			if((arr[i] % 2) == 0 ){
				evenList.add(arr[i]);
			}else{
				oddList.add(arr[i]);
			}
		}
		Collections.sort(evenList);
		Collections.sort(oddList);
		
	
		
		evenList.addAll(oddList);
		
		for(int ie : evenList){
			System.out.println(ie);
		}
		
	}

}
