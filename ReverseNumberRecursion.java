// Reverse a number using recursion

public class ReverseNumberRecursion {
    // Recursive method
    static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;   // base case
        }
        int digit = num % 10;
        rev = rev * 10 + digit;
        return reverse(num / 10, rev);  // recursive call
    }

    public static void main(String[] args) {
        int num = 1234;
        int result = reverse(num, 0);
        System.out.println("Reversed Number: " + result);
    }
}