// Reverse a number using for loop

public class ReverseNumberFor {
    public static void main(String[] args) {
        int num = 1234;   // original number
        int rev = 0;

        // for loop continues until num becomes 0
        for (; num != 0; num = num / 10) {
            int digit = num % 10;       // extract last digit
            rev = rev * 10 + digit;     // build reversed number
        }

        System.out.println("Reversed Number: " + rev);
    }
}