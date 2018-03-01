package com.ds.array;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrayList {

	public static void main(String[] args) {
		int[] arr1 = {2,4,6,8,10,12};
		int[] arr2 = {1,3,5,7,9,11,13,15};
		int[] finalArray = new int[arr1.length + arr2.length];
	//	merge1(arr1, arr2, finalArray);
		merge2(arr1, arr2); // O(m+n)

	}

	private static void merge2(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		int i=0,j=0,k=0;
		
		while(i < arr1.length && j < arr2.length){
			if(arr1[i] <= arr2[j]){
				arr3[k++] = arr1[i++];
			}else{
				arr3[k++] = arr2[j++];
			}
		}
		
		while(i < arr1.length){
			arr3[k++] = arr1[i++];
		}
		
		while(j < arr2.length){
			arr3[k++] = arr2[j++];
		}
		
		for(int n : arr3){
			System.out.print(n + " ");
		}
		
	}

	private static int[] merge1(int[] arr1, int[] arr2, int[] finalArray) {
		List<Integer> arrayList = new ArrayList<>();
		
		int i=0, j=0;
		while(i < arr1.length && j < arr2.length){
			if(arr1[i] < arr2[j]){
				arrayList.add(arr1[i]);
				i++;
			}else if(arr1[i] > arr2[j]){
				arrayList.add(arr2[j]);
				j++;
			}
		}
	
		if(arr1.length >= arr2.length){
			for(int x=0; x<arr1.length-i;x++){
				arrayList.add(arr1[i+x]);
			}
		}else{
			for(int x=0; x<arr2.length-j;x++){
				arrayList.add(arr2[j+x]);
			}
		}
		
		for(int n : arrayList){
			System.out.print(n + " ");
		}
		
		
		return null;
	}

}
