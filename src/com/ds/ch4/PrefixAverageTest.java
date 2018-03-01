package com.ds.ch4;

/**
 * Return AVerage 
 * @author meethunpanda
 *
 */
public class PrefixAverageTest {

	public static void main(String[] args) {
		int[] arr = {10,2,7,3,5};
		double[] prefixArray = prefixAverage(arr);
		
		for(double i : prefixArray){
			System.out.println(i);
		}

	}

	private static double[] prefixAverage(int[] arr) {
		double total = 0;
		double[] a = new double[arr.length];
		for(int i=0 ; i < arr.length ; i++){
			total += arr[i];
			a[i] = total/(i+1);
		}
		return a;
	}

}
