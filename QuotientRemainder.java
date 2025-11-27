import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter the Dividend: ");
        double dividend = sc.nextDouble();

        System.out.println("Enter the divisor: ");
        double divisor = sc.nextDouble();

        //Calculating quotient and remainder
        double quotient =  ( dividend / divisor);
        double remainder = (dividend % divisor);

        //Displaying Results
        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        sc.close();
    }
}
