package T20;

import java.util.HashMap;
import java.util.Map;

public class FractionToDecimal {
    public static void main(String[] args) {
        System.out.println(fractionToDecimal(1, 2)); // Output: "0.5"
        System.out.println(fractionToDecimal(1, -2)); // Output: "-0.5"
        System.out.println(fractionToDecimal(50, 22)); // Output: "2.(27)"
    }

    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        // Determine the sign
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }
        // Convert to long to avoid overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        // Append the integer part
        result.append(num / den);
        num %= den;
        if (num == 0) {
            return result.toString();
        }
        // Append the decimal part
        result.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (num != 0) {
            if (map.containsKey(num)) {
                result.insert(map.get(num), "(");
                result.append(")");
                break;
            }
            map.put(num, result.length());
            num *= 10;
            result.append(num / den);
            num %= den;
        }
        return result.toString();
    }
}

