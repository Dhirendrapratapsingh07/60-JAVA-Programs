// Armstrong numbers between a given range
public class ArmstrongRange {
    static boolean isArmstrong(int num) {
        int temp = num, sum = 0, digits = String.valueOf(num).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int start = 100, end = 999;
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) System.out.print(i + " ");
        }
    }
}