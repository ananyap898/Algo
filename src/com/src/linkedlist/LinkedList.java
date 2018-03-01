package com.src.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedList {
	
	private Node head;
	
	public void insertNodeAtHead(int data){
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public int lengthOfLinkedList(){
		int count = 0;
		Node current = this.head;
		while(current != null){
			count ++ ;
			current = current.getNextNode();
		}
		
		return count;
	}
	
	public void deleteHeadNode(){
		 this.head = this.head.getNextNode();
	}
	
	public boolean search(int value){
		boolean isFound = false;
		int n =0;
		Node current = this.head;
		while(current != null){
			n++;
			if(current.getData() == value){
				System.out.println(value +" is present in" + n +"th position in the list");
				return true;
			}
			current = current.getNextNode();
		}
		return false;
	}
	
	public void sort(LinkedList list){
		//TODO
		Node current = this.head;
		List<Integer> arrayList = new ArrayList<Integer>();
		
		while(current != null){
			arrayList.add(current.getData());
			current = current.getNextNode();
		}
		System.out.println("Before Sorted :" + arrayList.toString());
		
		Collections.sort(arrayList);
		
		System.out.println("After Sorted :" + arrayList.toString());
		
	}
	
	public void deleteAtAnyNode(int value){
		Node current = null;
		Node previous = null;
		
		if(head == null){
			System.out.println("List is Empty");
		}else {
			current = this.head;
			while(current != null && !(current.getData() == value) ){
				previous = current;
				current = current.getNextNode();
			}
			if (current != null){
				previous.setNextNode(current.getNextNode());
			}
			
			
		}
		
	}
	
	//TODO : Code is working,but do refactor..
	public void insertAtAnyIndex(int data, int position){
		/* Node current = head;
		    Node prev = null;
		    int i =0;
		    if(head == null ){
		        Node newNode = new Node();
		        newNode.data = data;
		        newNode.next = null;
		        head = newNode;
		        return head;
		    }
		    
		    if(position == 0){
		        Node newNode = new Node();
		        newNode.data = data;
		        newNode.next = head;
		        head = newNode;
		        return head;
		    }
		    while(current != null && i < position){
		        prev = current;
		        current = current.next;
		        i++;
		    }
		    Node newNode = new Node();
		    newNode.data = data;
		    newNode.next = prev.next;
		    prev.next = newNode;
		    
		    return head;*/
	}
	
	
	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		while(current != null){
			result = result + current.toString();
			current = current.getNextNode();
		}
		result += "}";
		return result;
	}
	
	

}
