package T20;

import java.util.HashMap;
import java.util.Map;

public class HighestAverageMarks {
    public static void main(String[] args) {
        String[][] marks = {
                {"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}
        };

        double highestAverage = findHighestAverageMarks(marks);
        System.out.println("Highest average marks: " + highestAverage);
    }

    public static double findHighestAverageMarks(String[][] marks) {
        Map<String, int[]> studentMarks = new HashMap<>();

        for (String[] entry : marks) {
            String name = entry[0];
            int mark = Integer.parseInt(entry[1]);

            studentMarks.putIfAbsent(name, new int[2]); // [sum, count]
            studentMarks.get(name)[0] += mark;
            studentMarks.get(name)[1]++;
        }

        double highestAverage = Double.NEGATIVE_INFINITY;
        for (Map.Entry<String, int[]> entry : studentMarks.entrySet()) {
            String name = entry.getKey();
            int sum = entry.getValue()[0];
            int count = entry.getValue()[1];
            double average = (double) sum / count;

            if (average > highestAverage) {
                highestAverage = average;
            }
        }

        return highestAverage;
    }
}
