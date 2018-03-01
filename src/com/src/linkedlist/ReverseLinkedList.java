package com.src.linkedlist;

import java.util.Stack;

public class ReverseLinkedList {

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
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		 head = list.reverseIterative(head);
		//head = list.reverseRecursive(head);
		//head = list.reverseUsingStack(head);
		System.out.println("");
		System.out.println("Reversed linked list  ");
		list.printList(head);
	}

	private Node reverseUsingStack(Node head) {
	
		Stack<Node> stack = new Stack<>();
		Node curr = head;
		while(curr != null){
			stack.push(curr);
			curr = curr.next;
		}
		curr = head;
		Node temp = head;
		while(!stack.isEmpty()){
			temp.next = stack.pop();
			temp = temp.next;
		//	System.out.println(stack.pop().data);
		}
		
		return head;
	}

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	/* Function to reverse the linked list(Iteratively) */
	Node reverseIterative(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	private Node reverseRecursive(Node p) {
		if (p.next == null) {
			head = p;
			return null;
		}
		reverseRecursive(p.next);
		p.next.next = p;
		p.next = null;

		return head;

	}

}
