package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {
    @Test
    void reverseStringTest() {
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, new ReverseString().reverseString(new char[]{'o', 'l', 'l', 'e', 'h'}));
    }
}