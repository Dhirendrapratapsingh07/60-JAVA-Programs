//Java Program to sort strings in alphabetical order

public class SortStrings {
    public static void main(String[] args) {
        String[] words = {"Banana", "Apple", "Mango", "Cherry", "Orange"};

        // Bubble sort logic
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    // Swap
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        // Print result
        System.out.println("Strings in alphabetical order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}