package com.princeton.algo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

/**
 * This calss adds 3 integers and finds out # of combinations whose addition equals to zero
 * @author meethunpanda
 *
 */
public class Threesum {

	public static void main(String[] args) {
		System.out.println("Theree Sum Integer Program..");
		int[] intArray = new int[] {10,20,-30,1,-11,100,200,-300};
		
		for (int i=0; i<intArray.length; i++)
		{
		  System.out.println(intArray[i]);
		}
       
       int count = addThreeIntegers(intArray);
       System.out.println("Total combinations--->" + count);	
	}

	private static int addThreeIntegers(int[] numbers) {
		int len = numbers.length;
		
		int count =0;
		
		for(int i=0 ; i < len ; i++){
			for(int j= i+1 ; j < len ; j++ ){
				for(int k= j+1 ; k < len ; k++){
					if( numbers[i] + numbers[j] + numbers[k] == 0 ){
						count ++;
					}
				}
			}
		}
		
		return count;
	}

}
