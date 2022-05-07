package com.leetcode;
/**
 * 1209. Remove All Adjacent Duplicates in String II
 */

import javafx.util.Pair;

import java.util.Stack;

public class RemoveDuplicatesII {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character, Integer>> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek().getKey() != c) {
                stack.push(new Pair<>(c, 1));
            } else {
                Pair<Character, Integer> top = stack.pop();
                stack.push(new Pair<>(top.getKey(), top.getValue() + 1));
                if (stack.peek().getValue() == k) {
                    stack.pop();
                }
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            Pair<Character, Integer> top = stack.pop();
            int freq = top.getValue();
            while (freq-- > 0) {
                result.insert(0, top.getKey());
            }
        }
        return result.toString();
    }
}
