// GCD of two numbers using recursion
public class GCD {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 36, b = 60;
        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));
    }
}