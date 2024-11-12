package T20;

public class LongestSubstring {
    public static void main(String[] args) {

        String str = "aabbbbCCddd";
        int[] result = findLongestSubstring(str);

        System.out.println("Starting index: " + result[0]);
        System.out.println("Length: " + result[1]);
        System.out.println("Substring: " + str.substring(result[0], result[0] + result[1]));
    }

    public static int[] findLongestSubstring(String str) {
        int maxLength = 0;
        int maxStartIndex = 0;
        int currentLength = 1;
        int currentStartIndex = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
            }
            else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStartIndex = currentStartIndex;
                }
                currentLength = 1;
                currentStartIndex = i;
            }
        }

        // Check the last substring
        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxStartIndex = currentStartIndex;
        }

        return new int[]{maxStartIndex, maxLength};
    }
}

