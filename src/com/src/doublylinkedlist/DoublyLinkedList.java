package com.src.doublylinkedlist;

public class DoublyLinkedList {
	
	private Node head;
	private int size;
	
	public DoublyLinkedList(){
		head = null;
		size = 0;
	}
	
	public void insertAtBeginning(int data){
		
		if (head == null){
			head = new Node( null , data , null);
		} else {
			Node newNode = new Node(null, data, head);
			head.setPrevious(newNode);
			head = newNode;
			
		//	head.previous = newNode.next;
		//	head = newNode;
		}
		size ++;
	}
	
	
	public void insertAtLast(int data){
		
		Node current = null;
		
		if(head == null){
			head = new Node(null, data, null);
		}else {
			current = this.head;
			while(current.next != null){
				current = current.next;
			}
			Node newNode = new Node(current,data,null);
			current.next = newNode;
		}
		size ++ ;
		
	}
	
	public void deleteAtFirst(){
		if(head != null){
			head = head.next;
			head.previous = null;
		}
		size --;
	}
	
	
	public void deleteAtLast(){
		Node current = this.head;
		Node previous = this.head;
		
		if(head != null){
			while(current.next != null){
				current = current.next;
				previous = current.previous;
			}
			previous.next = null;
		}
		size --;
	}
	
	public void insertAtAnyIndex(int index , int data){
		int i = 0;
		Node current = this.head;
		Node prev = this.head;
		while(i < index){
			i++;
			current = current.next;
			prev = current.previous;
		}
		Node newNode = new Node(current.previous , data , current.next);
		newNode.next = current;
		prev.next = newNode;
		
	}
	
	public void deleteAtAnyIndex(int index){
		int i = 0;
		Node current = this.head;
		Node prev = this.head;
		Node next = this.head;
		
		while(i < index){
			i++;
			current = current.next;
			prev = current.previous;
		}
		prev.next = current.next;
		//Node newNode = new Node(current.previous , data , current.next);
		//newNode.next = current;
		//prev.next = newNode;
	}
	
	public void print(){
		int i = 0;
		Node current = this.head;
		
		while(current != null){
			i++;
			System.out.println("Element at index-"+ i + "has a value :"+current.getData());
			current = current.next;
		}
	}
	
	public boolean isEmpty(){
		return head == null;
	}

	public int getSize(){
		return this.size;
	}
	
}
