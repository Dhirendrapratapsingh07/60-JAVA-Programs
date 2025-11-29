// Reverse a number using while loop

public class ReverseNumberWhile {
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;       // extract last digit
            rev = rev * 10 + digit;     // append digit
            num = num / 10;             // remove last digit
        }

        System.out.println("Reversed Number: " + rev);
    }
}