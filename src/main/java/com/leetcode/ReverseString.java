/**
 * 344. Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
package com.leetcode;

public class ReverseString {
    public char[] reverseString(char[] s) {
        int len = s.length;
        if (len == 1) return s;
        int start = 0;
        int end = len - 1;
        while (start < end) {
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
        return s;
    }
}
