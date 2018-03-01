package com.src.doublylinkedlist;

public class Node {
	
	private int data;
	public Node previous;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.previous = null;
		this.next = null;
	}

	public Node( Node previous, int data, Node next) {
		this.previous = previous;
		this.data = data;
		this.next = next;
	}
	
	public int getData(){
		return this.data;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
	

}
