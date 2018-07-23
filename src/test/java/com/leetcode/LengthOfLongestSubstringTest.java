package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLongestSubstringTest {
    @Test
    void givenStringReturnLengthOfLongestSubstringWithoutRepeatingCharacters() {
        assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"));
    }
}