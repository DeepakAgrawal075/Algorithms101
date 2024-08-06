/*
 * 5. Longest Palindromic Substring
 *
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Example 2:
 * Input: "cbbd"
 * Output: "bb"
 *
 * Example 3:
 * Input: s = "a"
 * Output: "a"
 *
 * Example 4:
 * Input: s = "ac"
 * Output: "a"
 */

/*
 * Manacher's algorithm
 */

package com.leetcode;

class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        // Transform the original string to avoid even/odd length issues
        StringBuilder t = new StringBuilder();
        t.append('#');
        for (int i = 0; i < s.length(); i++) {
            t.append(s.charAt(i));
            t.append('#');
        }

        int n = t.length();
        int[] p = new int[n]; // Array to store the radius of the palindrome centered at each character
        int center = 0, right = 0; // Current center and right edge of the rightmost palindrome

        for (int i = 0; i < n; i++) {
            int mirror = 2 * center - i; // Mirror of the current position i

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Expand around the center i
            while (i + p[i] + 1 < n && i - p[i] - 1 >= 0 && t.charAt(i + p[i] + 1) == t.charAt(i - p[i] - 1)) {
                p[i]++;
            }

            // Update the center and right edge if the expanded palindrome is beyond the current right edge
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }

        // Find the maximum element in p
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        // Extract the longest palindromic substring
        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}
