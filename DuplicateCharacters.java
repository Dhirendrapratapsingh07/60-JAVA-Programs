//Java Program to find duplicate characters in a String

import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();  // Optional: ignore case

        System.out.println("Duplicate characters in the string:");

        // Outer loop for each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if (ch == ' ') continue;

            int count = 1; // Start with 1 occurrence

            // Inner loop to compare with remaining characters
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            // Print only if duplicate found and not printed before
            if (count > 1 && str.indexOf(ch) == i) {
                System.out.println(ch + " → repeated " + count + " times");
            }
        }

        sc.close();
    }
}