package T20;

public class StringCharCount {

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                sb.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }


        sb.append(input.charAt(input.length() - 1)).append(count);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressString("aabbb"));
        System.out.println(compressString("aaaa"));
        System.out.println(compressString("a"));
    }
}
