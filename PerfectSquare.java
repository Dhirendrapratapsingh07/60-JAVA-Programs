// Java Program to check if a given number is perfect square

public class PerfectSquare {
    static boolean isPerfectSquare(int n) {
        int sqrt = (int)Math.sqrt(n);
        return (sqrt * sqrt == n);
    }

    public static void main(String[] args) {
        int num = 49;
        if (isPerfectSquare(num))
            System.out.println(num + " is a perfect square.");
        else
            System.out.println(num + " is not a perfect square.");
    }
}