package T20;

import java.util.LinkedHashMap;
import java.util.Map;


public class FirstNonRepeatingCharacter {

    public static Character firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }



    public static void main(String[] args) {
        String str1 = "12345";
        System.out.println("First non-repeating character: " + firstNonRepeatingCharacter(str1)); // Output: 1

        String str2 = "abbacd";
        System.out.println("First non-repeating character: " + firstNonRepeatingCharacter(str2)); // Output: c
    }
}
