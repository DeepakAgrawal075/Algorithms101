/**
 * 565. Array Nesting
 * You are given an integer array nums of length n where nums is a permutation of the numbers in the range [0, n - 1].
 *
 * You should build a set s[k] = {nums[k], nums[nums[k]], nums[nums[nums[k]]], ... } subjected to the following rule:
 *
 * The first element in s[k] starts with the selection of the element nums[k] of index = k.
 * The next element in s[k] should be nums[nums[k]], and then nums[nums[nums[k]]], and so on.
 * We stop adding right before a duplicate element occurs in s[k].
 * Return the longest length of a set s[k].
 */
package com.leetcode;

public class ArrayNesting {
    public static int arrayNesting(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                continue;
            max = Math.max(max, calcLength(nums, i));
        }
        return max;
    }

    private static int calcLength(int[] nums, int start) {
        if (nums[start] < 0) {
            return 0;
        }
        int nextValue = nums[start];
        nums[start] = Integer.MIN_VALUE;
        return 1 + calcLength(nums, nextValue);
    }
}
