package com.src.tree;

public class Node {
	
	public Node leftChild;
	public Node rightChild;
	private int data;
	
	public Node(){
		this.leftChild = null;
		this.rightChild = null;
		data = 0;
	}
	
	public Node(int data) {
		this.leftChild = null;
		this.rightChild = null;
		this.data = data;
	}


	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	

}
