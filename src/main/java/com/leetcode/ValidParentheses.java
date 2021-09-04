/**
 * 20. Valid Parentheses
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */
package com.leetcode;

import java.util.Stack;

class ValidParentheses {
    static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    static boolean isValidII(String s) {
        int balance = 0;
        if (s.length() % 2 != 0) return false;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance += 1;
            } else if (c == ')') {
                balance -= 1;
                if (balance < 0) {
                    return false;
                }
            }
        }
        return balance == 0;
    }
}
