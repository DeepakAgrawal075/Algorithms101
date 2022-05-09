/**
 * 11. Container With Most Water
 */
package com.leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            if (height[start] < height[end]) {
                maxArea = Math.max(maxArea, height[start] * (end - start));
                start++;
            } else {
                maxArea = Math.max(maxArea, height[end] * (end - start));
                end--;
            }
        }
        return maxArea;
    }
}
