package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NextGreaterElementTest {
    @Test
    void nextGreaterElementTest() {
        assertArrayEquals(new int[]{53, 81, 93}, NextGreaterElement.nextGreaterElement(new int[]{38, 53, 81}, new int[]{55, 38, 53, 81, 61, 93, 97, 32, 43, 78}));
        assertArrayEquals(new int[]{-1, 3, -1}, NextGreaterElement.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
        assertArrayEquals(new int[]{3, -1}, NextGreaterElement.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4}));
    }
}