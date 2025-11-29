// Java Program to perform bubble sort on Strings
public class BubbleSortStrings {
    public static void main(String[] args) {
        // Example array of strings
        String[] arr = {"Banana", "Apple", "Mango", "Cherry", "Orange"};

        int n = arr.length;

        // Bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent strings
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap if out of order
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted Strings:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}