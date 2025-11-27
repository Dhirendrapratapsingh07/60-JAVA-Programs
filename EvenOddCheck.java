//Java Program to Check Even or Odd Number

import java.util.Scanner;

public class EvenOddCheck{
    public static void main(String[] args){
        // taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();  //Read integer input


        // Checking condition using modulus operator
        if(num%2==0){
            System.out.println(num + " is an Even number");
        }
        else{
            System.out.println(num + " is an Odd number");
        }

        sc.close();
    }
}