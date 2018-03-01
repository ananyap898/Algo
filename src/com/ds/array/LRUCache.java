package com.ds.array;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LRUCache {

	private int capacity;
	private LinkedHashMap<Integer, Integer> map = null;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.map = new LinkedHashMap<>();
	}

	public int get(int key) {
		Integer value = map.get(key);
		if (value == null) {
			return -1;
		} else {
			map.put(key, value);
		}

		return value;
	}

	public void set(int key, int value) {
		if (map.containsKey(key)) {
			map.remove(key);
		} else if (map.size() == this.capacity) {
			Iterator<Integer> it = map.keySet().iterator();
			it.next();
			it.remove();
		}
		map.put(key, value);
	}

	public static void main(String[] args) {

	}

}
