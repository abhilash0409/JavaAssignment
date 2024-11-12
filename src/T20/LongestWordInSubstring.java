package T20;

public class LongestWordInSubstring {

    public static int longestWordLength(String[] dict, String toSearch) {
        int maxLength = 0;

        for (String word : dict) {
            if (word.toUpperCase().contains(toSearch.toUpperCase())) {
                maxLength = Math.max(maxLength, word.length());
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";

        int result = longestWordLength(dict, toSearch);
        System.out.println(result);
    }
}

