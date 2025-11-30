// Find HCF and LCM of two numbers
public class HCF_LCM {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        int hcf = gcd(a, b);
        int lcm = (a * b) / hcf;

        System.out.println("HCF of " + a + " and " + b + " = " + hcf);
        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
    }
}