//Java program to find occurrence of a character in a String

public class CharOccurrence {
    public static void main(String[] args) {
        String str = "programming";   // Example string
        char ch = 'm';                // Character to find
        int count = 0;                // Counter variable

        // Loop through the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;  // Increment if match found
            }
        }

        // Output result
        System.out.println("Character '" + ch + "' occurs " + count + " times in \"" + str + "\".");
    }
}