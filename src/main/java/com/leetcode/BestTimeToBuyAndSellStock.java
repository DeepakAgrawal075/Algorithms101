/**
 * 121. Best Time to Buy and Sell Stock
 */
package com.leetcode;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxDifference = 0;
        int minimumSoFar = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - minimumSoFar > maxDifference) {
                maxDifference = prices[i] - minimumSoFar;
            }
            if (prices[i] < minimumSoFar) {
                minimumSoFar = prices[i];
            }
        }
        return maxDifference;
    }
}