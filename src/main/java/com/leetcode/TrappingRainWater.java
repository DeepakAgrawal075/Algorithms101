/**
 * 42. Trapping Rain Water
 * <p>
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */
package com.leetcode;

class TrappingRainWater {
    static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int result = 0;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    result += (leftMax - height[left]);
                }
                ++left;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    result += (rightMax - height[right]);
                }
                --right;
            }
        }
        return result;
    }
}