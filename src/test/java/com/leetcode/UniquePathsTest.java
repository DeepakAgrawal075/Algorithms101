package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniquePathsTest {
    @Test
    void givenMNGridReturnUniquePaths() {
        assertEquals(28, UniquePaths.uniquePaths(3, 7));
        assertEquals(3, UniquePaths.uniquePaths(3, 2));
        assertEquals(28, UniquePaths.uniquePaths(7, 3));
        assertEquals(6, UniquePaths.uniquePaths(3, 3));
    }
}