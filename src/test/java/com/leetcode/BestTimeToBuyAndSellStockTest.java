package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {
    @Test
    void maxProfitTest() {
        assertEquals(5, new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}