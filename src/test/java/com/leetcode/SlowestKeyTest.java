package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SlowestKeyTest {
    @Test
    void slowestKeyTest() {
        assertEquals('c', new SlowestKey().slowestKey(new int[]{9, 29, 49, 50}, "cbcd"));
        assertEquals('a', new SlowestKey().slowestKey(new int[]{12, 23, 36, 46, 62}, "spuda"));
    }
}