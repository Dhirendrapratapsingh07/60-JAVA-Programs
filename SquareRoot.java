// Java Program to find square root of a number without sqrt method

public class SquareRoot {
    static double squareRoot(double n) {
        double x = n; // initial guess
        double y = 1; // second guess
        double e = 0.000001; // precision

        while (Math.abs(x - y) > e) {
            x = (x + y) / 2;
            y = n / x;
        }
        return x;
    }

    public static void main(String[] args) {
        double num = 50;
        System.out.println("Square root of " + num + " ≈ " + squareRoot(num));
    }
}