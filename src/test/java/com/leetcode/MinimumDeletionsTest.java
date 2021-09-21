package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDeletionsTest {
    @Test
    void minDeletionsTest(){
        assertEquals(0, new MinimumDeletions().minDeletions("aab"));
        assertEquals(2, new MinimumDeletions().minDeletions("aaabbbcc"));
        assertEquals(2, new MinimumDeletions().minDeletions("ceabaacb"));
    }
}