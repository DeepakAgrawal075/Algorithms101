package com.codefights;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixElementsSumTest {
    @Test
    void matrixElementsSumTest() {
        int[][] inputOne = {{0, 1, 1, 2},
                            {0, 5, 0, 0},
                            {2, 0, 3, 3}};

        int[][] inputTwo = {{1, 1, 1, 0},
                            {0, 5, 0, 1},
                            {2, 1, 3, 10}};

        assertEquals(9, MatrixElementsSum.matrixElementsSum(inputOne));
        assertEquals(9, MatrixElementsSum.matrixElementsSum(inputTwo));
    }
}