package com.ds.array;

import java.util.Stack;

public class ReverseStringTest {

	public static void main(String[] args) {
		System.out.println(reverseIterative("Meethun"));
		System.out.println(reverseUsingSTack("Meethun"));
		System.out.println(reverseInOrder("Meethun"));
	}

	private static char[] reverseInOrder(String s) {
		int first = 0;
		int end = s.length() - 1;
		
		while(first < end){
			swap(s.charAt(first), s.charAt(end));
			first++;
			end--;
		}
		
		
		return null;
	}

	private static void swap(char charAt1, char charAt2) {
		char tmp = charAt1;
		charAt1 = charAt2;
		charAt2 = tmp;
	}

	private static char[] reverseUsingSTack(String s) {
		char[] c = new char[s.length()];
		Stack<Character> stack= new Stack<>();
		for(int i=0; i< s.length(); i++){
			stack.push(s.charAt(i));
		}
		for(int i=0; i< s.length(); i++){
			c[i]= stack.pop();
		}
		return c;
	}

	private static char[] reverseIterative(String s) {
		char[] c = new char[s.length()];
		int n = s.length();
		for(int i=0; i< n; i++){
			c[i] = s.charAt(n-1-i);
		}
		
		return c;
	}

}
