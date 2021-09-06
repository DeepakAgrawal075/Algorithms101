package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderlyQueueTest {
    @Test
    void orderlyQueueTest() {
        assertEquals("acb", new OrderlyQueue().orderlyQueue("cba", 1));
        assertEquals("aaabc", new OrderlyQueue().orderlyQueue("baaca", 3));
    }
}