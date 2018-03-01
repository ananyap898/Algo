package com.src.tree.avl;

import java.util.ArrayList;
import java.util.List;

// merge : O(n)
public class MergeAVLTree {
	
	 Node root;
	static class Node{
		Node left;
		Node right;
		int data;
		
		Node(int d){
			data = d;
		}
	}
	
	private List<Integer> mergeTree(Node root1, Node root2) {
		List<Integer> alist1 = new ArrayList<>();
		List<Integer> alist2 = new ArrayList<>();
		
		List<Integer> updatedlist1  = inOrderList(root1,alist1);
		List<Integer> updatedlist2  = inOrderList(root2,alist2);
		
		return merge(updatedlist1, updatedlist2);
		
	}
	
	
	private List<Integer> merge(List<Integer> list1, List<Integer> list2) {
		List<Integer> list3 = new ArrayList<>();
		int i=0,j=0;
		while(i < list1.size() && j < list2.size()){
			if(list1.get(i) < list2.get(j)){
				list3.add(list1.get(i));
				i++;
			}else{
				list3.add(list2.get(j));
				j++;
			}
		}
		
		while(i < list1.size()){
			list3.add(list1.get(i));
			i++;
		}
		
		while(j < list2.size()){
			list3.add(list2.get(j));
			j++;
		}
		
		
		
		/*int[] arr1 = new int[list1.size()];
		for(int i=0; i<list1.size(); i++){
			arr1[i] = list1.get(i);
		}
		
		int[] arr2 = new int[list2.size()];
		for(int i=0; i<list2.size(); i++){
			arr2[i] = list2.get(i);
		}
		
		int[] arr3 = new int[arr1.length + arr2.length];
		int i=0,j=0,k=0;
		
		while(i < arr1.length && j < arr2.length){
			if(arr1[i] <= arr2[j]){
				arr3[k++] = arr1[i++];
			}else{
				arr3[k++] = arr2[j++];
			}
		}
		// remaining elements
		while(i < arr1.length){
			arr3[k++] = arr1[i++];
		}
		
		while(j < arr2.length){
			arr3[k++] = arr2[j++];
		}*/
		return list3;
		
	}



	private static Node convertToAVL(List<Integer> list3, int start, int end) {
		
		if(start > end){
			return null;
		}
		int mid = (start+end)/2;
		Node node = new Node(list3.get(mid));
		node.left = convertToAVL(list3, start, mid-1);
		node.right = convertToAVL(list3, mid+1, end);
		
		return node;
	}


	// In order traversal
	
	private static List<Integer> inOrderList(Node root, List<Integer> arrayList) {
		if(root == null){
			return null;
		}
		inOrderList(root.left,arrayList);
		arrayList.add(root.data);
		inOrderList(root.right,arrayList);
		
		return arrayList;
	}




	public static void main(String[] args) {
		MergeAVLTree tree1 = new MergeAVLTree();
        tree1.root = new Node(100);
        tree1.root.left = new Node(50);
        tree1.root.right = new Node(300);
        tree1.root.left.left = new Node(20);
        tree1.root.left.right = new Node(70);
         
       
             
        MergeAVLTree tree2 = new MergeAVLTree();
        tree2.root = new Node(80);  
        tree2.root.left = new Node(40);
        tree2.root.right = new Node(120);

        MergeAVLTree tree = new MergeAVLTree();
        List<Integer> list = tree.mergeTree(tree1.root, tree2.root);
        
        Node node = convertToAVL(list, 0, list.size()-1);
        List<Integer> outputList = new ArrayList<>();
        outputList = inOrderList(node, outputList);
        for(int i : outputList){
        	System.out.print(i + " ");
        }
	}

	

}
