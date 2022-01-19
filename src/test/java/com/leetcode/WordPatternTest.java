package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordPatternTest {
    @Test
    void wordPatternTest() {
        assertTrue(WordPattern.wordPattern("abba", "dog cat cat dog"));
        assertFalse(WordPattern.wordPattern("abba", "dog cat cat fish"));
        assertFalse(WordPattern.wordPattern("aaaa", "dog cat cat dog"));
        assertFalse(WordPattern.wordPattern("aaa", "aa aa aa aa"));
    }
}