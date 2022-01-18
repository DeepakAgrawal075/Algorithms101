package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DivideStringTest {

    @Test
    void divideStringTest() {
        assertArrayEquals(new String[]{"abc", "def", "ghi"}, DivideString.divideString("abcdefghi", 3, 'x'));
        assertArrayEquals(new String[]{"abc", "def", "ghi"}, DivideString.divideStringII("abcdefghi", 3, 'x'));
        assertArrayEquals(new String[]{"abc", "def", "ghi", "jxx"}, DivideString.divideString("abcdefghij", 3, 'x'));
        assertArrayEquals(new String[]{"abc", "def", "ghi", "jkx"}, DivideString.divideStringII("abcdefghijk", 3, 'x'));
    }
}