package com.src.tree;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int visit() {
		return root.getData();
	}

	public void add(int value) {
		root = insertNode(root, value);
	}

	private Node insertNode(Node root, int value) {
		if (root == null) {
			root = new Node(value);
		} else if (root.getData() < value) {
			root.rightChild = insertNode(root.rightChild, value);
		} else if (root.getData() > value) {
			root.leftChild = insertNode(root.leftChild, value);
		}
		return root;
	}

	public boolean search(int value) {
		return search(root, value);
	}

	private boolean search(Node root, int value) {
		boolean isFound = false;

		while ((root != null) && !isFound) {

			if (root.getData() < value) {
				root = root.rightChild;
			} else if (root.getData() > value) {
				root = root.leftChild;
			} else {
				isFound = true;
				break;
			}
			isFound = search(root, value);
		}

		return isFound;
	}

	// Find Heights of a tree : longest edge from root to a leaf node
	public int height() {
		return findHeight(root);

	}

	public int findHeight(Node root) {
		if (root == null)
			return -1;
		else
			return 1 + Math.max(findHeight(root.leftChild), findHeight(root.rightChild));
	}

	// Find size of a tree : Total number of nodes in a tree
	public int size() {
		return findSize(root);
	}

	private int findSize(Node root) {
		if (root == null)
			return 0;
		else
			return 1 + findSize(root.leftChild) + findSize(root.rightChild);
	}

	/**
	 * Pre-Order Traversal Root -> Left -> Right
	 */

	public void preOrderTraversal() {
		preOrderTraversalOfBST(root);
	}

	private void preOrderTraversalOfBST(Node root) {
		if (root == null)
			return;

		System.out.println(root.getData() + " ");
		preOrderTraversalOfBST(root.leftChild);
		preOrderTraversalOfBST(root.rightChild);

	}

	/**
	 * In-order Traversal Left->Root->Right
	 */

	public void inOrderTraversal() {
		inOrderTraversalOfBST(root);
	}

	private void inOrderTraversalOfBST(Node root) {
		if (root == null)
			return;

		inOrderTraversalOfBST(root.leftChild);
		System.out.println(root.getData() + " ");
		inOrderTraversalOfBST(root.rightChild);

	}

	/**
	 * In-order Traversal Left->Root->Right
	 */

	public void postOrderTraversal() {
		postOrderTraversalOfBST(root);
	}

	private void postOrderTraversalOfBST(Node root) {
		if (root == null)
			return;

		postOrderTraversalOfBST(root.leftChild);
		postOrderTraversalOfBST(root.rightChild);
		System.out.println(root.getData() + " ");
	}

}
