/**
 * 204. Count Primes
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 * Reference : https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 */
package com.leetcode;

import java.util.Arrays;

public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        int primeCount = 0;
        Arrays.fill(primes, true);

        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j = j + i) { // Elements need to be marked from i square.
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                primeCount++;
            }
        }
        return primeCount;
    }
}