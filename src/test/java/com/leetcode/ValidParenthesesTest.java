package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    @Test
    void givenParenthesesReturnIsValid() {
        assertTrue(ValidParentheses.isValid(""));
        assertTrue(ValidParentheses.isValid("()"));
        assertTrue(ValidParentheses.isValid("()[]{}"));
        assertTrue(ValidParentheses.isValid("{[]}"));
        assertFalse(ValidParentheses.isValid("([)]"));
        assertFalse(ValidParentheses.isValid("(]"));
    }
}