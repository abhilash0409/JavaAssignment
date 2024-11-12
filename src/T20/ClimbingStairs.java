package T20;

public class ClimbingStairs {

    public static int climbStairs(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 2;
        int current = 0;

        for (int i = 2; i < n; i++) {
            current = prev1 + prev2; // The number of ways to reach the current stair
            prev1 = prev2; // Update prev1 to prev2
            prev2 = current; // Update prev2 to current
        }

        return prev2;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
    }
}
