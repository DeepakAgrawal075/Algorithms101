/*
 * I/P: ABC
 * O/P:
 * ABC
 * ACB
 * BAC
 * BCA
 * CAB
 * CBA
 */
import java.util.Scanner;

/* This solution works only if the input string has distinct characters */

public class AllPermutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String suffix = input.next();
        showPattern("", suffix);
    }

    private static void showPattern(String prefix, String suffix) {
        if (suffix.length() <= 1) {
            System.out.println("prefix-> " + prefix + " suffix-> " + suffix);
            System.out.println(prefix + suffix);
        } else {
            for (int i = 0; i < suffix.length(); i++) {
                String newString = suffix.substring(0, i) + suffix.substring(i + 1);
                showPattern(prefix + suffix.charAt(i), newString);
            }
        }
    }
}