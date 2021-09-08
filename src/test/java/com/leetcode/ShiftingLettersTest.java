package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShiftingLettersTest {
    @Test
    void shiftingLettersTest() {
        assertEquals("d", new ShiftingLetters().shiftingLetters("a", new int[]{3}));
        assertEquals("c", new ShiftingLetters().shiftingLetters("z", new int[]{3}));
        assertEquals("rpl", new ShiftingLetters().shiftingLetters("abc", new int[]{3, 5, 9}));
        assertEquals("gfd", new ShiftingLetters().shiftingLetters("aaa", new int[]{1, 2, 3}));
    }
}