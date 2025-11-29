// Java Program to check Palindrome string using Recursion

public class PalindromeRecursion {

    // Recursive function to check palindrome
    static boolean isPalindrome(String str, int start, int end) {
        // Base case: if start >= end, string is palindrome
        if (start >= end) {
            return true;
        }

        // If mismatch found, return false
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call: check inner substring
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "madam";  // Example input

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }
}