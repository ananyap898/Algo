package com.src.tree;

public class BSTDemo {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		
		// Insertion of Nodes
		tree.add(7);
		tree.add(1);
		tree.add(0);
		tree.add(3);
		tree.add(2);
		tree.add(5);
		tree.add(4);
		tree.add(6);
		tree.add(9);
		tree.add(8);
		tree.add(10);
		
		System.out.println("Is element searched found ?" + tree.search(18));
		
		System.out.println("Pre-Order Traversal -->" );
		tree.preOrderTraversal();
		
		System.out.println("In-Order Traversal -->" );
		tree.inOrderTraversal();
		
		System.out.println("Post-Order Traversal -->" );
		tree.postOrderTraversal();
		
		System.out.println("Height of the Tree--" + tree.height());
		System.out.println("Size of the Tree--" + tree.size());
		
	}

}
