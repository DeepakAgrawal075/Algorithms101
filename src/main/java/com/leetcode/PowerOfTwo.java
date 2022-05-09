/**
 * 231. Power of Two
 */
package com.leetcode;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        while (n >= 2) {
            if (n % 2 != 0) {
                return false;
            } else {
                n = n / 2;
            }
        }
        return n == 1;
    }

    public boolean isPowerOfTwoII(int n) {
        long number = 1;
        while (number < n) {
            number = number * 2;
        }
        return number == n;
    }
}
