/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 *
 * Note:
 *
 * The solution set must not contain duplicate triplets.
 *
 * Example:
 *
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end) {
                    if (nums[i] + nums[start] + nums[end] == 0) {
                        result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    }
                    if (nums[i] + nums[start] + nums[end] < 0) {
                        int currentStart = start;
                        while (nums[start] == nums[currentStart] && start < end) {
                            start++;
                        }
                    } else {
                        int currentEnd = end;
                        while (nums[end] == nums[currentEnd] && start < end) {
                            end--;
                        }
                    }
                }
            }
        }
        return result;
    }
}
