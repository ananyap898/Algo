package com.ds.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest substring without repeated characters
 * @author meethunpanda
 *
 */
public class LongestSubStringCharacter {

	public static void main(String[] args) {
		String s = "abccdefgh";
		int subStr = findLongestsubstring(s);
		System.out.println(subStr);

	}

	private static int findLongestsubstring(String s) {
		int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
          
        	if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                ans = Math.max(ans, j - i);
                System.out.println(ans + " , " + s.substring(i,j));
            }
            else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
	}

}
