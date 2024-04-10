

import java.util.Scanner;

public class PalindromeChecker {

    public static String transformInput(String input) {
        input = input.toLowerCase();
        input = input.replace(",", "");
        input = input.replace("!", "");
        return input;
    }

    public static boolean checkPalindrome(String input) {
        String reverseString = new StringBuilder(input).reverse().toString();
        if (input.equals(reverseString)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a String to be checked:");
        String input = scanner.nextLine();

        String transformed = transformInput(input);

        boolean isPalindrome = checkPalindrome(transformed);
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }
}