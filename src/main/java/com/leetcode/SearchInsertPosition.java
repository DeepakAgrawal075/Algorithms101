/**
 * 35. Search Insert Position
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 */
package com.leetcode;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int mid;
        int left = 0;
        int right = nums.length - 1;
        int result = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}