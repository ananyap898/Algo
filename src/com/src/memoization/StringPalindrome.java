package com.src.memoization;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println(isStringPalindrome("cabac"));
		System.out.println(isIntegerPalindrome(121));

	}

	private static boolean isIntegerPalindrome(int number) {
		int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10; //1,2,1
            reverse = reverse * 10 + remainder; //1,12,121
            palindrome = palindrome / 10; //12,1
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;

	}

	private static boolean isStringPalindrome(String s) {
		int n = s.length();

		for (int i = 0; i < n / 2; i++) {
			if (!(s.charAt(i) == s.charAt(n - i - 1))) {
				return false;
			}
		}

		return true;
	}

}
