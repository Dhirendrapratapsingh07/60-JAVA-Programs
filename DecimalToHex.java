//Java Program to convert decimal to hexadecimal

public class DecimalToHex {
    public static void main(String[] args) {
        int decimal = 26;
        String hex = Integer.toHexString(decimal);
        System.out.println("Hexadecimal: " + hex.toUpperCase());
    }
}