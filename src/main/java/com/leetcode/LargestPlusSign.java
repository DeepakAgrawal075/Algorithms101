/**
 * 764. Largest Plus Sign
 */
package com.leetcode;

import java.util.Arrays;

public class LargestPlusSign {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] inputGrid = buildGrid(n, mines);
        printGrid(n, inputGrid);
        int[][] leftToRight = new int[n][n];
        int[][] rightToLeft = new int[n][n];
        int[][] topToBottom = new int[n][n];
        int[][] bottomToTop = new int[n][n];

        for (int i = 0; i < n; i++) {
            int runningSum = 0;
            for (int j = 0; j < n; j++) {
                if (inputGrid[i][j] == 0) {
                    runningSum = 0;
                } else {
                    runningSum = inputGrid[i][j] + runningSum;
                }
                leftToRight[i][j] = runningSum;
            }
        }

        printGrid(n, leftToRight);
        for (int i = 0; i < n; i++) {
            int runningSum = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (inputGrid[i][j] == 0) {
                    runningSum = 0;
                } else {
                    runningSum = inputGrid[i][j] + runningSum;
                }
                rightToLeft[i][j] = runningSum;
            }
        }

        printGrid(n, rightToLeft);
        for (int i = 0; i < n; i++) {
            int runningSum = 0;
            for (int j = 0; j < n; j++) {
                if (inputGrid[j][i] == 0) {
                    runningSum = 0;
                } else {
                    runningSum = inputGrid[j][i] + runningSum;
                }
                topToBottom[j][i] = runningSum;
            }
        }

        printGrid(n, topToBottom);
        for (int i = 0; i < n; i++) {
            int runningSum = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (inputGrid[j][i] == 0) {
                    runningSum = 0;
                } else {
                    runningSum = inputGrid[j][i] + runningSum;
                }
                bottomToTop[j][i] = runningSum;
            }
        }

        printGrid(n, bottomToTop);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int minLen = Math.min(Math.min(leftToRight[i][j], rightToLeft[i][j]), Math.min(topToBottom[i][j], bottomToTop[i][j]));
                ans = Math.max(ans, minLen);
            }
        }
        return ans;
    }

    private int[][] buildGrid(int n, int[][] mines) {
        int[][] inputGrid = new int[n][n];
        for (int[] row : inputGrid) {
            Arrays.fill(row, 1);
        }
        for (int[] mine : mines) {
            inputGrid[mine[0]][mine[1]] = 0;
        }
        return inputGrid;
    }

    public void printGrid(int n, int[][] grid)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.printf("%5d ", grid[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}