//Java Program to convert char Array to String

public class CharArrayToString {
    public static void main(String[] args) {
        // Step 1: Create a char array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};

        // Step 2: Convert char array to String using constructor
        String str = new String(charArray);

        // Step 3: Print result
        System.out.println("Converted String: " + str);
    }
}