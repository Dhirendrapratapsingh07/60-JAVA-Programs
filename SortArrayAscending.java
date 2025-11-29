import java.util.Arrays;

public class SortArrayAscending {
    public static void main(String[] args) {
        // Example array
        int[] arr = {5, 2, 8, 1, 3};

        // Sorting in ascending order
        Arrays.sort(arr);

        // Printing sorted array
        System.out.println("Array in Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}