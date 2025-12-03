// Java Program for Linear Search

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // array
        int key = 30;                     // value to search
        int result = -1;                  // element not found

        // Search using loop
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                result = i; // store index if found
                break;      // exit loop
            }
        }

        // Print result
        if(result == -1)
            System.out.println("Not Found");
        else
            System.out.println("Found at index " + result);
    }
}