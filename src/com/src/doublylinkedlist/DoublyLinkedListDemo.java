package com.src.doublylinkedlist;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		 DoublyLinkedList dList = new DoublyLinkedList();
		 dList.insertAtBeginning(3);
		 dList.insertAtBeginning(6);
		 dList.insertAtBeginning(30);
		 dList.insertAtBeginning(16);
		 
		 dList.print();
		 System.out.println("Size Of the List -->" + dList.getSize());
		 
		 dList.insertAtLast(100);
		 dList.insertAtLast(200);
		 
		 dList.print();
		 System.out.println("Size Of the List -->" + dList.getSize());
		 
		 
		 //System.out.println("Delete at the Beginning");
		// dList.deleteAtFirst();
		// dList.print();
		 
		 //System.out.println("Delete at the End");
		 //dList.deleteAtLast();
		 //dList.print();
		 
		// System.out.println("Insertion at any index");
		 //dList.insertAtAnyIndex(3, 0);
		 //dList.print();
		 
		 System.out.println("Deletion at any index");
		 dList.deleteAtAnyIndex(4);
		 dList.print();
	}

}
