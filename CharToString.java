// Java char to string conversion

public class CharToString {
    public static void main(String[] args) {
        char ch = 'A';
        String str1 = String.valueOf(ch); // method
        String str2 = "" + ch;            // concatenation
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
    }
}