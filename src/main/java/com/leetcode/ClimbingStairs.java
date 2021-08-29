/**
 * 70. Climbing Stairs
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
package com.leetcode;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int[] steps = new int[n + 1];
        steps[0] = 1;
        steps[1] = 1;
        for (int step = 2; step <= n; step++) {
            steps[step] = steps[step - 1] + steps[step - 2];
        }
        return steps[n];
    }
}