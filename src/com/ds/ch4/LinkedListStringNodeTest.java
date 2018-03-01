package com.ds.ch4;

import java.util.Scanner;

public class LinkedListStringNodeTest {

	public static void main(String[] args) {

		StringNode front = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Movie name... : ");
		String movieName = sc.nextLine();
		
		front = addToFront(front, movieName);
		System.out.println(front);
		
		System.out.println("Enter a Movie name... : ");
		String movieName2 = sc.nextLine();
		front = addToFront(front, movieName2);
		System.out.println(front);
		
		System.out.println("Enter a Movie name... : ");
		String movieName3 = sc.nextLine();
		front = addToFront(front, movieName3);
		System.out.println(front);
		
		
		front = deleteFront(front);
		System.out.println(front);

	}

	private static StringNode deleteFront(StringNode front) {
		if(null != front.next){
			front = front.next;
			return front;
		}
		return null;
	}

	private static StringNode addToFront(StringNode front, String name) {
		
		StringNode temp = new StringNode( name, front);
		temp.next = front;
		front = temp;
		
		return temp;
	}

}
