//Java Program to add two complex numbers

import java.util.Scanner;

class Complex{
    double real;
    double imag;

    Complex(double r , double i){
        real=r;
        imag=i;
    }
    Complex add(Complex c){
        // Adding real and imaginary part separately
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
    void display(){
        System.out.println(real + " + " + imag + "i");
    }
}
public class AddComplexNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Taking two complex numbers from user
        System.out.println("Enter first real number: ");
        double r1 = sc.nextDouble();
        System.out.println("Enter first imaginary number: ");
        double i1 = sc.nextDouble();

        System.out.println("Enter second real number: ");
        double r2 = sc.nextDouble();
        System.out.println("Enter second imaginary number: ");
        double i2 = sc.nextDouble();

        //creating objects
        Complex c1 = new Complex(r1,i1);
        Complex c2 = new Complex(r2,i2);

        // Adding c1 and c2
        Complex sum = c1.add(c2);

        //Print the result
        System.out.println("The sum of two complex numbers are: ");
        sum.display();
        sc.close();
    }
}
