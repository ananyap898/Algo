package com.src.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	
	public static void main(String[] args) {
		RemoveDuplicate list = new RemoveDuplicate();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(15);
		list.head.next.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		
		head = list.removeDuplicate(head);
		System.out.println("");
		System.out.println("Reversed linked list  ");
		list.printList(head);

	}


	private Node removeDuplicate(Node head) {
		Node curr = head;
		Node prev = null;
		Set<Integer> hashSet = new HashSet<>();
		while(curr != null){
			if(! hashSet.contains(curr.data)){
				hashSet.add(curr.data);
				prev = curr;
				curr = curr.next;
			}else{
				prev.next = curr.next;
				curr = curr.next;
			}
		}
		
		return head;
	}


	private void printList(Node node) {
		while(node != null){
			System.out.print(node.data + " ");
			node = node.next;
		}
		
	}

}
