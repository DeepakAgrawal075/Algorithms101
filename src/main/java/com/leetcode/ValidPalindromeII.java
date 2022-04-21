/**
 * 680. Valid Palindrome II
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 */
package com.leetcode;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return validPalindromeHelper(s, start + 1, end) || validPalindromeHelper(s, start, end - 1);
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean validPalindromeHelper(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
