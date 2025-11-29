// Java Program to Calculate average of numbers using Array
import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Step 2: Declare array
        int[] arr = new int[n];

        // Step 3: Input elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Calculate sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];  // add each element
        }

        // Step 5: Calculate average
        double average = (double) sum / n;

        // Step 6: Display result
        System.out.println("Average = " + average);

        sc.close();
    }
}