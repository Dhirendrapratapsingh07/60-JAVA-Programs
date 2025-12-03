// Java String to Boolean

public class StringToBoolean {
    public static void main(String[] args) {
        String str1 = "true";
        String str2 = "False";
        boolean b1 = Boolean.parseBoolean(str1);
        boolean b2 = Boolean.parseBoolean(str2);
        System.out.println("b1: " + b1); // true
        System.out.println("b2: " + b2); // false
    }
}
