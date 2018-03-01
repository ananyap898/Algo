package com.princeton.algo;

import java.util.Arrays;

public class AnagramTest {

	public static void main(String[] args) {
		System.out.println(isAnagram("ram", "mar"));

	}

	public static boolean isAnagram(String word, String anagram) {
		if(word.length() != anagram.length()){
			return false;
		}
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);
	}

}
