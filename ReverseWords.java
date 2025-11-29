// Java Program to reverse words in a String

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World from Java";  // Input string

        // Step 1: Split the string into words
        String[] words = str.split(" ");

        // Step 2: Use StringBuilder to build reversed string
        StringBuilder reversed = new StringBuilder();

        // Step 3: Traverse words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);   // Add word
            if (i != 0) {
                reversed.append(" ");    // Add space between words
            }
        }

        // Step 4: Print result
        System.out.println("Original String: " + str);
        System.out.println("Reversed Words: " + reversed.toString());
    }
}