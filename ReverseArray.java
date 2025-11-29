// Java Program to reverse an array
public class ReverseArray {
    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 20, 30, 40, 50};

        // Print original array
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse logic using two pointers
        int i = 0, j = arr.length - 1;
        while (i < j) {
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // Print reversed array
        System.out.print("\nReversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}