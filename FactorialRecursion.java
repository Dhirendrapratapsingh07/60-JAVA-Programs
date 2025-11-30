// Java Program to find Factorial of a number using Recursion

public class FactorialRecursion {
    static int factorial(int n) {
        if (n == 0 || n == 1)  // base case
            return 1;
        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " = " + factorial(num));
    }
}