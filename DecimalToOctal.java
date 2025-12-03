// Java Program to Convert Decimal to Octal

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Decimal Number: ");
        int decimal = sc.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octal);
    }
}