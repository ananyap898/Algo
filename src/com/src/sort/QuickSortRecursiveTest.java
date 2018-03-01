package com.src.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortRecursiveTest {

	public static void main(String[] args) {
		int[] unsorted = { 6, 5, 3, 1, 8, 7, 2, 4 };
		System.out.println("Unsorted array -->" + Arrays.toString(unsorted));
		
		List<Integer> numbers = new ArrayList<>();
		for (Integer i : unsorted){
			numbers.add(i);
		}
		
		System.out.println(numbers.size());
		
		List<Integer> sortedList = quickSort(numbers);
		for(int num : sortedList){
			System.out.print(" "+num);
		}
	}

	public static List<Integer> quickSort(List<Integer> numbers) {
		
		final Integer pivot = numbers.get(0);
		System.out.println("Pivot --" + pivot);
		final List<Integer> lower = new ArrayList<>();
		final List<Integer> higher = new ArrayList<>();
		
		for(int i =1; i < numbers.size(); i++){
			if(numbers.get(i) < pivot ) {
				lower.add(numbers.get(i));
			}else{
				higher.add(numbers.get(i));
			}
		}
		
		final List<Integer> sortedList = quickSort(lower);
		sortedList.add(pivot);
		sortedList.addAll(quickSort(higher));
		
		return sortedList;
	}

}
