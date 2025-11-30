// Java program to break integer into digits

public class BreakDigits {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Digits of " + num + ":");
        while (num > 0) {
            int digit = num % 10;   // extract last digit
            System.out.println(digit);
            num = num / 10;         // remove last digit
        }
    }
}