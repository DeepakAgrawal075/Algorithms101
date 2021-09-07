package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    void searchTest() {
        assertEquals(4, new BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, new BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        assertEquals(4, new BinarySearch().searchRecursive(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, new BinarySearch().searchRecursive(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}
