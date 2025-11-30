// Largest of three numbers
public class LargestOfThree {
    public static void main(String[] args) {
        int a = 25, b = 78, c = 87;
        int largest;

        if (a >= b && a >= c) largest = a;
        else if (b >= c) largest = b;
        else largest = c;

        System.out.println("Largest number is: " + largest);
    }
}