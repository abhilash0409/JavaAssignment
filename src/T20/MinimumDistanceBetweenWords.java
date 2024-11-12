package T20;

public class MinimumDistanceBetweenWords {
    public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";

        System.out.println("The minimum distance between '" + word1 + "' and '" + word2 + "' is: " +
                findMinDistance(str, word1, word2));
    }

    public static int findMinDistance(String sentence, String word1, String word2) {
        String[] words = sentence.split(" ");
        int minDistance = Integer.MAX_VALUE;
        int lastPosWord1 = -1;
        int lastPosWord2 = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                lastPosWord1 = i;
                if (lastPosWord2 != -1) {
                    minDistance = Math.min(minDistance, lastPosWord1 - lastPosWord2);
                }
            } else if (words[i].equals(word2)) {
                lastPosWord2 = i;
                if (lastPosWord1 != -1) {
                    minDistance = Math.min(minDistance, lastPosWord2 - lastPosWord1);
                }
            }
        }

        return minDistance;
    }
}

