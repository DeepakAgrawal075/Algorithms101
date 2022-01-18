/**
 * 2138. Divide a String Into Groups of Size k
 */
package com.leetcode;

public class DivideString {
    public static String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() % k != 0) {
            sb.append(fill);
        }

        String[] ans = new String[sb.length() / k];
        int idx = 0, i = 0;

        while (i < sb.length()) {
            ans[idx++] = sb.substring(i, i + k);
            i = i + k;
        }
        return ans;
    }

    public static String[] divideStringII(String s, int k, char fill) {
        int groupCount = s.length() % k == 0 ? s.length() / k : s.length() / k + 1;
        String[] ans = new String[groupCount];

        int idx = 0;
        int counter = 0;
        int i = 0;
        StringBuilder subStr = new StringBuilder();
        while (i < s.length()) {
            while (counter < k && i < s.length()) {
                subStr.append(s.charAt(i));
                counter++;
                i++;
            }
            while (subStr.length() < k) {
                subStr.append(fill);
            }
            ans[idx++] = subStr.toString();
            counter = 0;
            subStr = new StringBuilder();
        }
        return ans;
    }
}
