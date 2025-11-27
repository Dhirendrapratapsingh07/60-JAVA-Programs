// Java Program to calculate power of a number
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Taking inputs from user
        System.out.print("Enter base number: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        double result = 1;

        // Special case: 0^0
        if (base == 0 && exponent == 0) {
            System.out.println("0 raised to the power 0 is: Undefined");
        }
        else if (exponent > 0) {
            // Positive power
            for (int i = 1; i <= exponent; i++) {
                result = result * base;
            }
            System.out.println(base + " raised to the power " + exponent + " is: " + result);
        }
        else if (exponent == 0) {
            // Zero power
            result = 1;
            System.out.println(base + " raised to the power " + exponent + " is: " + result);
        }
        else {
            // Negative power
            int positiveExponent = -exponent;
            for (int i = 1; i <= positiveExponent; i++) {
                result = result * base;
            }
            result = 1.0 / result;
            System.out.println(base + " raised to the power " + exponent + " is: " + result);
        }
    }
}