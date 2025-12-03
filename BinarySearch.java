// Java Program for Binary Search

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int key = 40;

        // Binary Search logic
        int low = 0, high = arr.length - 1;
        int result = -1;

        while(low <= high) {
            int mid = (low + high) / 2; // find middle
            if(arr[mid] == key) {
                result = mid; // found
                break;
            } else if(arr[mid] < key) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        // Print result
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
    }
}