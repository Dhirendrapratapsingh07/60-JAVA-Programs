// Java program to convert Boolean to String

public class BooleanToString {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;

        // Using String.valueOf()
        String str1 = String.valueOf(flag1);

        // Using Boolean.toString()
        String str2 = Boolean.toString(flag2);

        System.out.println("String from flag1: " + str1);
        System.out.println("String from flag2: " + str2);
    }
}
