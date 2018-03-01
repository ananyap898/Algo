package com.src.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>> {
	
	private ArrayList<T> items;
	
	public Heap() {
		 items = new ArrayList<T>();
	}
	
	
	// This will be called for every insert() operation on the heap..
	// As the index of childs of a parent(p) can be determined by {2p+1,2p+2}, we can determine the index of a child by p = (k-1)/2
	private void shiftUp(){
		int lastItemIndex = items.size() - 1;
		
		while(lastItemIndex > 0){
			int parentOfLastItemIndex = (lastItemIndex - 1) / 2;
			
			T item = items.get(lastItemIndex);
			T parent = items.get(parentOfLastItemIndex);
			
			if(item.compareTo(parent) > 0){
				// swap Item and Parent
				items.set(lastItemIndex, parent);
				items.set(parentOfLastItemIndex, item);
				
				// move up one level
				lastItemIndex = parentOfLastItemIndex;
			}else{
				break;
			}
			
			/*if(item > parent){
				// swap Item and Parent
				items.set(parentOfLastItemIndex, item);
				items.set(lastItemIndex, parent);
				
				lastItemIndex = parentOfLastItemIndex;
			}else{
				break;
			}*/
		}
		
	}
	
	public void insert(T item){
		items.add(item);
		shiftUp();
	}
	
	private void shiftDown(){
		
		int k = 0;
		int left = 2*k + 1;
		
		while(left < items.size()){
			int max = left;
			int right = left + 1;
			
			if(right < items.size()){ // there is a right child
				if(items.get(right).compareTo(items.get(left)) > 0){
					//swap
					T temp = items.get(k);
					items.set(k, items.get(max));
					items.set(max, temp);
					k = max;
					left = 2*k + 1;
				}
			}else{
				break;
			}
			
		}
		
	}
	
	public T delete(){
		if(items.size() == 1){
			return items.remove(0);
		}
		
		T hold = items.get(0);
		items.set(0, items.remove(items.size() - 1));
		shiftDown();
		return hold;
	}
	
	public int size(){
		return items.size();
	}
	
	public String toString(){
		return items.toString();
	}
	
	public boolean isEmpty(){
		return items.isEmpty();
	}
	

}
