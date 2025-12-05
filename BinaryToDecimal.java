// Java Program to convert binary to Decimal

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1101"; // hardcoded binary
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
    }
}