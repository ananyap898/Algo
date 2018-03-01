package com.src.linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insertNodeAtHead(5);
		list.insertNodeAtHead(15);
		list.insertNodeAtHead(3);
		list.insertNodeAtHead(1);
		list.insertNodeAtHead(17);
		
	//	list.deleteHeadNode();
		System.out.println("Is Element present in the list ? :" + list.search(1));
	//	list.sort(list);
	//	list.deleteAtAnyNode(1);
		
		System.out.println("Elements traversed -->"+list);
		//System.out.println("Length of the Linked List -->" + list.lengthOfLinkedList());
		
		

	}

}
