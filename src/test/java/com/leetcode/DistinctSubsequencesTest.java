package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistinctSubsequencesTest {
    @Test
    void numDistinctTest() {
        assertEquals(3, new DistinctSubsequences().numDistinct("rabbbit", "rabbit"));
        assertEquals(5, new DistinctSubsequences().numDistinct("babgbag", "bag"));
    }
}