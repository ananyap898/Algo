package com.src.heap;

import java.util.Scanner;

public class HeapTest {

	public static void main(String[] args) {
		Heap<Integer> heap = new Heap<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter next value..DONE to stop");
		String line = sc.next();
		
		while(!line.equals("DONE")){
			heap.insert(Integer.parseInt(line));
			System.out.println(heap);
			System.out.println("Enter next value..DONE to stop");
			line = sc.next();
		}
		
		while(!heap.isEmpty()){
			int max = heap.delete();
			System.out.println(max + "->" + heap);
		}

	}

}
