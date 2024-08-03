package com.leetcode;
/**
 * 1209. Remove All Adjacent Duplicates in String II
 */


import java.util.Stack;

class Pair<U, V> {
    private final U key;
    private final V value;

    public Pair(U key, V value) {
        this.key = key;
        this.value = value;
    }

    public U getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

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
