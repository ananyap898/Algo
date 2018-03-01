package com.princeton.algo;

public class StackProgram {

	private Node first = null;

	private class Node {
		Node next;
		String item;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void push(String item) {
		Node nodeFirst = first;
		first = new Node();
		first.item = item;
		first.next = nodeFirst;
	}

	public String pop() {
		String item = first.item;
		first = first.next;
		return item;
	}

	public static void main(String[] args) {
		StackProgram sp = new StackProgram();
		sp.push("1");
		sp.push("2");
		sp.pop();
		
		System.out.println(sp.first.item);
	}
}
