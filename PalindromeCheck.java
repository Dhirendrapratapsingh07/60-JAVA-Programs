import java.util.Locale;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Take input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toUpperCase();

        //Reverse the string
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        //Compare original and reversed
        if (str.equals(reversed)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }

        sc.close();
    }
}