package T20;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        // Base cases
        if (n == 0) {
            return 0; // No way to reach 0th stair
        }
        if (n == 1) {
            return 1; // Only one way to reach the 1st stair
        }

        // Two variables to store the number of ways to reach the previous two stairs
        int prev1 = 1; // Number of ways to reach the 0th stair
        int prev2 = 2; // Number of ways to reach the 1st stair
        int current = 0;

        // Start from the 2nd stair and go up to the nth stair
        for (int i = 2; i < n; i++) {
            current = prev1 + prev2; // The number of ways to reach the current stair
            prev1 = prev2; // Update prev1 to prev2
            prev2 = current; // Update prev2 to current
        }

        // The number of ways to reach the nth stair is stored in prev2
        return prev2;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(climbStairs(2));  // Expected output: 2 (1+1, 2)
        System.out.println(climbStairs(3));  // Expected output: 3 (1+1+1, 1+2, 2+1)
        System.out.println(climbStairs(4));  // Expected output: 5 (1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2)
        System.out.println(climbStairs(5));  // Expected output: 8
    }
}
