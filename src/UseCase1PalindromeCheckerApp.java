/**
 * ================================================================
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 * Use Case 2: Hardcoded Palindrome Check
 *
 * Description:
 * This class represents the entry point of the Palindrome Checker
 * Management System.
 *
 * UC1: Displays a welcome message with app name and version.
 * UC2: Checks a hardcoded string and prints whether it is a palindrome.
 *
 * Author: Developer
 * Version: 1.0
 */
public class UseCase1PalindromeCheckerApp {

    /**
     * Application entry point.
     * This is the first method executed by the JVM when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // =========================================================
        // UC1: Welcome + App Details
        // =========================================================
        System.out.println("========================================");
        System.out.println("      PALINDROME CHECKER APP");
        System.out.println("========================================");
        System.out.println("Application Name   : Palindrome Checker App");
        System.out.println("Application Version: 1.0");
        System.out.println("Status             : Started");
        System.out.println("========================================");

        // =========================================================
        // UC2: Hardcoded Palindrome Check
        // =========================================================
        String input = "MADAM"; // hardcoded test value
        System.out.println();
        System.out.println("UC2: Hardcoded Palindrome Check");
        System.out.println("Input : " + input);
        System.out.println("Result: " + (isPalindrome(input) ? "Palindrome" : "Not a Palindrome"));
    }

    /**
     * Checks whether the given string is a palindrome (case-insensitive).
     * Returns false for null input; returns true for empty strings.
     *
     * @param str the string to check
     * @return true if str is a palindrome, false if str is null or not a palindrome
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String normalized = str.toLowerCase();
        int left = 0;
        int right = normalized.length() - 1;
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}