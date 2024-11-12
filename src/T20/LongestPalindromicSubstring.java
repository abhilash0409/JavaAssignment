package T20;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        String[] result = findLongestPalindromicSubstring(str);
        System.out.println("Longest palindromic substring: " + result[0]);
        System.out.println("Length: " + result[1]);
    }

    public static String[] findLongestPalindromicSubstring(String s) {
        if (s == null || s.length() < 1) {
            return new String[]{"", "0"};
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        String longestPalindrome = s.substring(start, end + 1);
        return new String[]{longestPalindrome, String.valueOf(longestPalindrome.length())};
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

