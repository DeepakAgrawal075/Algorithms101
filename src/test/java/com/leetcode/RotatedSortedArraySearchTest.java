package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RotatedSortedArraySearchTest {

    @Test
    void givenRotatedSortedArraySearchTarget(){
        assertEquals(4, RotatedSortedArraySearch.search(new int[]{4,5,6,7,0,1,2}, 0));
        assertEquals(-1, RotatedSortedArraySearch.search(new int[]{4,5,6,7,0,1,2}, 3));
        assertEquals(-1, RotatedSortedArraySearch.search(new int[]{1}, 0));
    }
}