// Java hexadecimal to decimal conversion

public class HexToDecimal {
    public static void main(String[] args) {
        String hex = "1A"; // hexadecimal
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Decimal: " + decimal);
    }
}