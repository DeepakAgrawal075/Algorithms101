/**
 * 115. Distinct Subsequences
 * Given two strings s and t, return the number of distinct subsequences of s which equals t.
 * A string's subsequence is a new string formed from the original string by deleting some (can be none) of the characters without disturbing the remaining characters' relative positions.
 * (i.e., "ACE" is a subsequence of "ABCDE" while "AEC" is not).
 */
package com.leetcode;

public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        int[][] result = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            result[i][0] = 1;
        }

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    result[i][j] = result[i - 1][j] + result[i - 1][j - 1];
                } else {
                    result[i][j] = result[i - 1][j];
                }
            }
        }
        return result[s.length()][t.length()];
    }
}