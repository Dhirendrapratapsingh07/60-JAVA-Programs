// Java program to count vowels and consonants in a String

public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Hello World";   // Example input
        str = str.toLowerCase();

        int vowels = 0, consonants = 0;
        StringBuilder vowelList = new StringBuilder();
        StringBuilder consonantList = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                    vowelList.append(ch).append(" ");
                } else {
                    consonants++;
                    consonantList.append(ch).append(" ");
                }
            }
        }

        System.out.println("Vowels count: " + vowels);
        System.out.println("Consonants count: " + consonants);
        System.out.println("Vowels are: " + vowelList);
        System.out.println("Consonants are: " + consonantList);
    }
}