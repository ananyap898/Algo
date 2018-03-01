package com.ds.ch4;

public class StringNode {
	
	private String value;
	StringNode next;
	
	public StringNode(String value, StringNode next) {
		super();
		this.value = value;
		this.next = next;
	}
	
	
	@Override
	public String toString() {
		return "StringNode [value=" + value + ", Next=" + next + "]";
	}
	
	

}
