package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSortedVowelStringsTest {
    @Test
    void countVowelStrings(){
        assertEquals(5, new CountSortedVowelStrings().countVowelStrings(1));
        assertEquals(15, new CountSortedVowelStrings().countVowelStrings(2));
        assertEquals(66045, new CountSortedVowelStrings().countVowelStrings(33));
    }
}