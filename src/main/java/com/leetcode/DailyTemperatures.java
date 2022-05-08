/**
 * 739. Daily Temperatures
 */
package com.leetcode;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] answer = new int[len];
        Stack<Integer> indexes = new Stack<>();

        for (int i = 0; i < len; i++) {
            while (!indexes.isEmpty() && temperatures[i] > temperatures[indexes.peek()]) {
                answer[indexes.peek()] = i - indexes.peek();
                indexes.pop();
            }
            indexes.push(i);
        }
        return answer;
    }
}
