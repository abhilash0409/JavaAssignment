package T20;

public class CustomAtoi {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "-123";
        String str3 = "1a23";

        System.out.println(str1 + "': " + customAtoi(str1));
        System.out.println(str2 + "': " + customAtoi(str2));
        System.out.println(str3 + "': " + customAtoi(str3));
    }

    public static int customAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }

        int sign = 1;
        int start = 0;
        int result = 0;


        if (str.charAt(0) == '-') {
            sign = -1;
            start = 1;
        }

        for (int i = start; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return -1;
            }
            result = result * 10 + (c - '0');
        }

        return result * sign;
    }
}
