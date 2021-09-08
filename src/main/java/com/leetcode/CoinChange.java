/**
 * 322. Coin Change
 * Unbounded Knapsack.
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 * Return the fewest number of coins that you need to make up that amount.
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 */
package com.leetcode;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] result = new int[amount + 1];
        result[0] = 0;
        for (int i = 1; i <= amount; i++) {
            result[i] = Integer.MAX_VALUE - 1;
        }
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j >= coins[i]) {
                    result[j] = Math.min(result[j], result[j - coins[i]] + 1);
                }
            }
        }
        return result[amount] == Integer.MAX_VALUE - 1 ? -1 : result[amount];
    }
}
