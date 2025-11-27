//Java Program to check whether input character is vowel or consonant

import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character: " );
        char ch = sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
            System.out.println(ch + " is a Vowel");
        } else if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ){
            System.out.println(ch + " is a Consonant");
        }
        else{
            System.out.println("Invalid Input! Please enter an Alphabet.");
        }
        sc.close();
    }
}
