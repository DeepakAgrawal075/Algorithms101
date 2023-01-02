/**
 * 520. Detect Capital
 */
package com.leetcode;

public class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        int countUC = 0;
        int countLC = 0;
        char[] chars = word.toCharArray();
        for(char c : chars){
            if(Character.isUpperCase(c)) countUC++;
            else if(Character.isLowerCase(c)) countLC++;
        }
        if(countUC == word.length()) return true;
        if(countLC == word.length()) return true;
        if(countUC == 1 && Character.isUpperCase(chars[0])) return true;
        return false;
    }
}
