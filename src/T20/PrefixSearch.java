package T20;

import java.util.ArrayList;
import java.util.List;

public class PrefixSearch {

    public static List<String> findWordsWithPrefix(String[] words, String prefix) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.startsWith(prefix)) {
                result.add(word);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";

        List<String> result = findWordsWithPrefix(arr, prefix);
        System.out.println(result);
    }


}
