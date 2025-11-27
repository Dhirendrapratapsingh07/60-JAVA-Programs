//Java Program to add two binary numbers

import java.util.Scanner;
public class AddBinaryNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking two binary number as String
        System.out.println("Enter first binary number: ");
        String binary1 = sc.nextLine();

        System.out.println("Enter second binary number: ");
        String binary2 = sc.nextLine();

        //Converting binary numbers into integers
        int num1 = Integer.parseInt(binary1,2);
        int num2 = Integer.parseInt(binary2,2);

        // Adding two integers
        int sum = num1+num2;

        //Convert the sum back to binary
        String binarySum = Integer.toBinaryString(sum);

        // print the result
        System.out.println("Sum of " + binary1 + " and " + binary2 + " is " + binarySum);

        sc.close();
    }
}
