// Java int to char conversion

public class IntToChar {
    public static void main(String[] args) {
        int num1 = 65;   // ASCII value of 'A'
        int num2 = 97;   // ASCII value of 'a'

        // Casting int to char
        char ch1 = (char) num1;
        char ch2 = (char) num2;

        System.out.println("Char from 65: " + ch1); // 'A'
        System.out.println("Char from 97: " + ch2); // 'a'
    }
}
