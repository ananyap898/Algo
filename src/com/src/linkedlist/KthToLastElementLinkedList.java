package com.src.linkedlist;

import com.src.linkedlist.ReverseLinkedList.Node;

public class KthToLastElementLinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		KthToLastElementLinkedList list = new KthToLastElementLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(15);
		list.head.next.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);

		int kth = list.findKthToLastElement(head, 2);
		System.out.println("");
		System.out.println("Kth element to the last node is  " + kth);
	

	}

	private int findKthToLastElement(Node head, int k) {
	
		Node curr = head;
		Node kth = head;
		
		for(int i =0 ; i< k; i++){
			curr = curr.next;
		}
		
		while(curr != null){
			curr = curr.next;
			kth = kth.next;
		}
		
		return kth.data;
	}

	private void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}

	}

}
