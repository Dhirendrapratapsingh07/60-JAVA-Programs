// Java binary to octal conversion
public class BinaryToOctal {
    public static void main(String[] args) {
        String binary = "1010"; // binary
        int decimal = Integer.parseInt(binary, 2); // binary to decimal
        String octal = Integer.toOctalString(decimal); // decimal to octal
        System.out.println("Octal: " + octal);
    }
}
