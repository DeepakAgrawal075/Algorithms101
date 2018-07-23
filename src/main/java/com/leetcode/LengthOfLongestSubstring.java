/**
 * 3. Longest Substring Without Repeating Characters
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3.
 *
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 */
package com.leetcode;

import java.util.HashSet;

class LengthOfLongestSubstring {
    static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        HashSet<Character> characters = new HashSet<>();
        int i = 0, j = 0;
        while (j < s.length()) {
            if (!characters.contains(s.charAt(j))) {
                characters.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                characters.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}

