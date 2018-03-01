package com.src.linkedlist;

import com.src.linkedlist.ReverseLinkedList.Node;

public class LinkedListLoop {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	
	public boolean isCycleExist(Node head){
		
		Node fast = head;
		Node slow = head;
		
		while(slow != null && fast != null & fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow){
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
