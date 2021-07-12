import java.util.Scanner;

public class AllSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int len = input.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                System.out.println(input.substring(i, j + 1));
            }
        }
    }
}
// Number of substrings of a string: https://www.geeksforgeeks.org/number-substrings-string/