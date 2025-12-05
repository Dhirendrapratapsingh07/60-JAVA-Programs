// Java Program to Convert Decimal to Binary
public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 25;

        // Method 1: Using built-in function
        System.out.println("Decimal: " + num);
        System.out.println("Binary (built-in): " + Integer.toBinaryString(num));

        // Method 2: Manual conversion
        String binary = "";
        int temp = num;
        while (temp > 0) {
            binary = (temp % 2) + binary;
            temp = temp / 2;
        }
        System.out.println("Binary (manual): " + binary);
    }
}