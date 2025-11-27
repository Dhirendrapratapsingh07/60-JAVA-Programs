//Java Program to calculate compound interest

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter the Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.println("Enter the Rate of Interest in %: ");
        double rate = sc.nextDouble();

        System.out.println("Enter the Years: ");
        int years = sc.nextInt();

        System.out.println("Enter the Months: ");
        int months = sc.nextInt();

        //Converting total time into years(Fractional)
        double time = years + (months/12.0);

        //Formula: CI =P * (1 + r/100)^n - P
        double amount = principal * Math.pow((1 + rate/100), time );
        double compoundInterest = amount - principal;

        //Output
        System.out.println("Principal = " + principal);
        System.out.println("Rate = " + rate + "%");
        System.out.println("Time = " + time + " years");
        System.out.println("Compound Interest = " + compoundInterest);
        System.out.println("Total Amount = " + amount);

        sc.close();
    }
}
