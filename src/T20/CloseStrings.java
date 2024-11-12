package T20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CloseStrings {
    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }


        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();


        for (char c : word1.toCharArray()) {
            freqMap1.put(c, freqMap1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            freqMap2.put(c, freqMap2.getOrDefault(c, 0) + 1);
        }


        if (!freqMap1.keySet().equals(freqMap2.keySet())) {
            return false;
        }


        int[] freq1 = freqMap1.values().stream().mapToInt(i -> i).toArray();
        int[] freq2 = freqMap2.values().stream().mapToInt(i -> i).toArray();

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }

    public static void main(String[] args) {
        CloseStrings solution = new CloseStrings();
        System.out.println(solution.closeStrings("abc", "bca"));
        System.out.println(solution.closeStrings("a", "aa"));
        System.out.println(solution.closeStrings("cabbba", "abbccc"));

    }
}

