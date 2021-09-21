/**
 * 1254. Number of Closed Islands
 */
package com.leetcode;

public class NumberOfClosedIslands {
    public int closedIsland(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int closedIslands = 0, rows = grid.length, cols = grid[0].length;
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (grid[i][j] == 0) {
                    if (isClosedIsland(grid, i, j, rows, cols)) {
                        closedIslands++;
                    }
                }
            }
        }
        return closedIslands;
    }

    private boolean isClosedIsland(int[][] grid, int i, int j, int rows, int cols) {
        if (grid[i][j] == -1 || grid[i][j] == 1) return true;
        if (isOnPerimeter(i, j, rows, cols)) return false;
        grid[i][j] = -1;
        boolean left = isClosedIsland(grid, i, j - 1, rows, cols);
        boolean right = isClosedIsland(grid, i, j + 1, rows, cols);
        boolean up = isClosedIsland(grid, i - 1, j, rows, cols);
        boolean down = isClosedIsland(grid, i + 1, j, rows, cols);
        return left && right && up && down;
    }

    private boolean isOnPerimeter(int i, int j, int rows, int cols) {
        return i == 0 || j == 0 || i == rows - 1 || j == cols - 1;
    }
}
