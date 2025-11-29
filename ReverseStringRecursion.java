// Program to reverse a string using recursion

public class ReverseStringRecursion {

    // Recursive method
    public static String reverse(String str) {
        // Base case: if string is empty or single char
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Recursive case: reverse substring and add first char at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    // Main method
    public static void main(String[] args) {
        String input = "JAVA";
        String reversed = reverse(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}