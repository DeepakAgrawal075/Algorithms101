package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateParenthesesTest {
    @Test
    void givenNReturnValidParentheses() {
        assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"), GenerateParentheses.generateParenthesis(3));
        assertEquals(Collections.singletonList("()"), GenerateParentheses.generateParenthesis(1));
    }
}