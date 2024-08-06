package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstringTest {
    @Test
    void givenStringReturnLongestPalindromicSubstring() {
        assertEquals("bab", LongestPalindromicSubstring.longestPalindrome("babad"));
        assertEquals("bb", LongestPalindromicSubstring.longestPalindrome("cbbd"));
        assertEquals("a", LongestPalindromicSubstring.longestPalindrome("a"));
        assertEquals("a", LongestPalindromicSubstring.longestPalindrome("ac"));
    }
}