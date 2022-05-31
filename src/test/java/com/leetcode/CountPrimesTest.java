package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPrimesTest {
    @Test
    void countPrimes(){
        assertEquals(4, new CountPrimes().countPrimes(10));
        assertEquals(7, new CountPrimes().countPrimes(19));
        assertEquals(8, new CountPrimes().countPrimes(20));
    }
}