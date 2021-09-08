package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {
    @Test
    void searchInsertTest() {
        assertEquals(2, new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 0));
        assertEquals(0, new SearchInsertPosition().searchInsert(new int[]{1}, 0));
    }
}