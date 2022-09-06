import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given a string S, check if it is palindrome or not.
 */
public class PalindromeString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String S = reader.readLine();
            Solution solution = new Solution();
            System.out.println(solution.isPalindrome(S));
        }

    }
}

class Solution {
    int isPalindrome(String S) {
        int start = 0;
        int end = S.length() - 1;
        while (start < end) {
            if (S.charAt(start) != S.charAt(end)) {
                return 0;
            } else {
                start++;
                end--;
            }
        }
        return 1;
    }
}
