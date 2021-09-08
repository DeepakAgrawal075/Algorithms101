package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinChangeTest {
    @Test
    void coinChangeTest() {
        assertEquals(2, new CoinChange().coinChange(new int[]{1, 5, 6, 8}, 11));
        assertEquals(3, new CoinChange().coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(-1, new CoinChange().coinChange(new int[]{2}, 3));
        assertEquals(0, new CoinChange().coinChange(new int[]{1}, 0));
        assertEquals(1, new CoinChange().coinChange(new int[]{1}, 1));
        assertEquals(2, new CoinChange().coinChange(new int[]{1}, 2));
    }
}