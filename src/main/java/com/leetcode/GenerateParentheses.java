/**
 * 22. Generate Parentheses
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrackHelper(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    private static void backtrackHelper(List<String> list, StringBuilder str, int open, int closed, int n) {
        if (closed > open) {
            return;
        }
        if (closed == open && str.length() == n * 2) {
            list.add(str.toString());
            return;
        }
        if (open < n) {
            str.append("(");
            backtrackHelper(list, str, open + 1, closed, n);
            str.deleteCharAt(str.length() - 1);
        }
        if (closed < open) {
            str.append(")");
            backtrackHelper(list, str, open, closed + 1, n);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
