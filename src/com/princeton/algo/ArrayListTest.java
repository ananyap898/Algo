package com.princeton.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(Integer i=0 ; i < 10 ; i++){
			list.add(i);
		}
		
		System.out.println(list.contains(7));
	}

}
