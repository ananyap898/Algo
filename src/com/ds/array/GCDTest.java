package com.ds.array;

public class GCDTest {

	public static void main(String[] args) {
		System.out.println(findGCD(54,24));

	}

	private static int findGCD(int i, int j) {
		if(j == 0){
			return i;
		}
		
		return findGCD(j, i%j);
	}

}
