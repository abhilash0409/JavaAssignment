package T20;


public class PowerOfTen {
    public static void main(String[] args) {
        int num1 = 1000;
        int num2 = 123;

        System.out.println(num1 + " is a power of 10: " + isPowerOfTen(num1));
        System.out.println(num2 + " is a power of 10: " + isPowerOfTen(num2));
    }

    public static boolean isPowerOfTen(int num) {
        if (num <= 0) {
            return false;
        }

        while (num % 10 == 0) {
            num /= 10;
        }

        return num == 1;
    }
}
