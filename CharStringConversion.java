// Java Program to Convert char to String and String to char

import java.util.Scanner;

public class CharStringConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Convert char to String
        String str1 = String.valueOf(ch);       // Method 1
        String str2 = Character.toString(ch);   // Method 2
        String str3 = ch + "";                  // Method 3

        System.out.println("\nChar to String conversions:");
        System.out.println("Using String.valueOf(): " + str1);
        System.out.println("Using Character.toString(): " + str2);
        System.out.println("Using concatenation: " + str3);

        // Input a string
        System.out.print("\nEnter a string: ");
        String word = sc.next();

        // Convert String to char (extracting characters)
        char firstChar = word.charAt(0);   // first character
        char lastChar = word.charAt(word.length() - 1); // last character

        System.out.println("\nString to Char conversions:");
        System.out.println("First character of " + word + " is: " + firstChar);
        System.out.println("Last character of " + word + " is: " + lastChar);
    }
}