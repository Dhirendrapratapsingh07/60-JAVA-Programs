// Java Program to Add the elements of an Array

public class ArraySum {
    public static void main(String[] args) {
        // Step 1: Declare and initialize array
        int[] numbers = {10, 20, 30, 40, 50};

        // Step 2: Initialize sum
        int sum = 0;

        // Step 3: Traverse array and add elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];  // sum = sum + numbers[i]
        }

        // Step 4: Print result
        System.out.println("Sum of array elements: " + sum);
    }
}