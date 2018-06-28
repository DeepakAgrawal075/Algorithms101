package net.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplesOfThreeAndFiveTest {
    @Test
    void givenRangeReturnSumOfMultiplesOfThreeAndFive() {
        assertEquals(23, MultiplesOfThreeAndFive.multiplesOf3And5(10));
        assertEquals(233168, MultiplesOfThreeAndFive.multiplesOf3And5(1000));
    }
}