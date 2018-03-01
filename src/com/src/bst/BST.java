package com.src.bst;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BST {
	static int count=0;
	static TreeNode root;
	static Stack<TreeNode> stack = new Stack<>();

	static class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;

		public TreeNode(int data) {
			this.left = null;
			this.right = null;
			this.data = data;
		}

		public TreeNode(TreeNode left, TreeNode right, int data) {
			this.left = left;
			this.right = right;
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

	}

	public static void main(String[] args) {
		BST tree = new BST();
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

		// tree.print();
		System.out.println("is element found ? : " + tree.search(6));
		System.out.println("is element found ? : " + tree.search(66));

		System.out.println("Size of the tree-->" + tree.findSize());
		System.out.println("Height of the tree-->" + tree.findHeight());
		System.out.println("Is Tree Balanced-->" + isBalanced());
		System.out.println("Is Tree a BST-->" + isBST());

		tree.kthSmallest(3);

		// Tree Traversal
		tree.inOrder();
		tree.reverseInOrder();// second largest
		tree.preOrder();
		tree.postOrder();

		// Find the leaf nodes
		tree.findLeaf();

	}

	/**
	 * In-Order will arrange the number in sorted frmat.
	 * 
	 * @param k
	 */
	private void kthSmallest(int k) {
		int kth = kthSmallestElement(root, k);
		System.out.println("Kth smallest element===" + kth);
	}

	private int kthSmallestElement(TreeNode root, int k) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList = inOrderTraversalList(arrayList, root);
		return arrayList.get(k);
	}

	public static List<Integer> inOrderTraversalList(List<Integer> arrayList, TreeNode root) {
		if (root == null) {
			return null;
		}
		inOrderTraversalList(arrayList, root.left);
		arrayList.add(root.data);
		inOrderTraversalList(arrayList, root.right);
		return arrayList;
	}

	/**
	 * In-order traversal; check elements are in increased order.
	 * 
	 * @return
	 */
	private static boolean isBST() {
		return isBST(root);
	}

	private static boolean isBST(TreeNode root) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList = inOrderTraversalList(arrayList, root);
		int[] arr = new int[arrayList.size()];
		arr[0] = arrayList.get(0);
		for (int i = 1; i < arrayList.size(); i++) {
			arr[i] = arrayList.get(i);
			if (arr[i] <= arr[i - 1]) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Recurse the entire tree, and for each node, compute the heights of each
	 * subtree.
	 * 
	 * @return
	 */
	private static boolean isBalanced() {
		return isBalanced(root);
	}

	private static boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		int heightDiff = determineHeight(root.left) - determineHeight(root.right);
		if (Math.abs(heightDiff) > 1) {
			return false;
		} else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}

	// Total elements in the tree
	private int findSize() {
		return determineSize(root);
	}

	private int determineSize(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + determineSize(root.left) + determineSize(root.right);
		}
	}

	// Heights of the tree
	private int findHeight() {
		return determineHeight(root);
	}

	public static int determineHeight(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + Math.max(determineHeight(root.left), determineHeight(root.right));
		}
	}

	public void add(int value) {
		root = insert(root, value);
	}

	// insert into the tree
	public TreeNode insert(TreeNode root, int val) {
		if (root == null) {
			root = new TreeNode(val);
		} else if (root.data < val) {
			root.right = insert(root.right, val);
		} else {
			root.left = insert(root.left, val);
		}
		if (!stack.contains(root)) {
			stack.push(root);
		}
		return root;
	}

	// search a key
	public boolean search(int value) {
		return searchTree(root, value);
	}

	private boolean searchTree(TreeNode root, int value) {
		if (root == null) {
			return false;
		}

		if (root.data == value) {
			return true;
		} else if (root.data < value) {
			return searchTree(root.right, value);
		} else {
			return searchTree(root.left, value);
		}

	}

	// In-Order Traversal : Recursive and Iterative
	private void inOrder() {
		System.out.print("In Order Traversal ---> ");
		// inOrderTraversal(root);
		inOrderTraversalRecursive(root);
	}

	private void inOrderTraversalRecursive(TreeNode root) {

		Stack<TreeNode> inOrderStacks = new Stack<>();
		TreeNode current = root;

		while (!inOrderStacks.isEmpty() || current != null) {
			if (current != null) {
				inOrderStacks.push(current);
				current = current.left;
			} else {
				TreeNode node = inOrderStacks.pop();
				System.out.print(node.data + " ");
				current = node.right;
			}
		}

	}

	private void inOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}

	// Reverese In-Order Traversal : Recursive and Iterative
	private void reverseInOrder() {
		System.out.print("Reverse In Order Traversal ---> ");
		reverseInOrderTraversalRecursive(root);
	}

	private void reverseInOrderTraversalRecursive(TreeNode root) {
		if (root == null) {
			return;
		}
		reverseInOrderTraversalRecursive(root.right);
		System.out.print(root.data + " ");
		reverseInOrderTraversalRecursive(root.left);
		
	}

	// Post-Order Traversal : 0 2 4 6 5 3 1 8 10 9 7
	private void postOrder() {
		System.out.print("Post Order Traversal ---> ");
		// postOrderTraversal(root);
		postOrderTraversalIterative(root);
	}

	private void postOrderTraversalIterative(TreeNode root) {
		Stack<TreeNode> postLeafNodes = new Stack<>();
		postLeafNodes.push(root);

		while (!postLeafNodes.isEmpty()) {
			TreeNode current = postLeafNodes.peek();

			if (current.left == null && current.right == null) {
				System.out.print(postLeafNodes.pop().data + " ");
			} else {
				if (current.right != null) {
					postLeafNodes.push(current.right);
					current.right = null;
				}
				if (current.left != null) {
					postLeafNodes.push(current.left);
					current.left = null;
				}
			}

		}

	}

	private void postOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data + " ");
	}

	// Pre Order Traversal ---> 7 1 0 3 2 5 4 6 9 8 10
	private void preOrder() {
		System.out.print("Pre Order Traversal ---> ");
		// preOrderTraversal(root);
		preOrderTraversalIterative(root);
	}

	private void preOrderTraversalIterative(TreeNode root) {
		Stack<TreeNode> preLeafNodes = new Stack<>();
		preLeafNodes.push(root);

		while (!preLeafNodes.isEmpty()) {
			TreeNode current = preLeafNodes.pop();
			System.out.print(current.data + " ");

			if (current.right != null) {
				preLeafNodes.push(current.right);
			}
			if (current.left != null) {
				preLeafNodes.push(current.left);
			}

		}

	}

	private void preOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	// Leaf Nodes
	private void findLeaf() {
		findLeafNodeRecursive(root);
		// findLeafNodeIteration(root);

	}

	private void findLeafNodeIteration(TreeNode root) {
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node.left == null && node.right == null) {
				System.out.println("Leaf Node--->" + node.data);
			}
		}
	}

	private void findLeafNodeRecursive(TreeNode root) {
		if (root == null) {
			return;
		}

		if (root.left == null && root.right == null) {
			System.out.println("Leaf Node--->" + root.data);
		}
		findLeafNodeRecursive(root.left);
		findLeafNodeRecursive(root.right);

	}

	private void print() {
		System.out.print("Elements in the Tree ---> ");
		while (!stack.isEmpty()) {
			System.out.print(stack.pop().data + " ");

		}
		System.out.println();
	}

}
