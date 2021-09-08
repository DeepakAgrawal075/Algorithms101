/**
 * 977. Squares of a Sorted Array
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */
package com.leetcode;

public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int start = 0;
        int end = length - 1;
        for (int m = length - 1; m >= 0; m--) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                result[m] = nums[start] * nums[start];
                start++;
            } else {
                result[m] = nums[end] * nums[end];
                end--;
            }
        }
        /* Trivial
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        */
        return result;
    }
}