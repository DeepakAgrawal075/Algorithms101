/**
 * 905. Sort Array By Parity
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * Return any array that satisfies this condition.
 */
package com.leetcode;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        for (int element : nums) {
            if (element % 2 == 0) {
                result[start] = element;
                start++;
            } else {
                result[end] = element;
                end--;
            }
        }
        return result;
    }
}
