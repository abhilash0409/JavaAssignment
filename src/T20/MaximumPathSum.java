package T20;

public class MaximumPathSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 10, 2, 0, 20, 4},
                {1, 0, 0, 30, 2, 5},
                {0, 10, 4, 0, 2, 0},
                {1, 0, 2, 20, 0, 4}
        };
        System.out.println("Maximum path sum: " + findMaxPathSum(matrix));
    }

    public static int findMaxPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];

        // Initialize the dp array with the values of the first column
        for (int i = 0; i < m; i++) {
            dp[i][0] = matrix[i][0];
        }

        // Fill the dp array
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < m; i++) {
                int max = dp[i][j - 1]; // Left
                if (i > 0) {
                    max = Math.max(max, dp[i - 1][j - 1]); // Upper-left diagonal
                }
                if (i < m - 1) {
                    max = Math.max(max, dp[i + 1][j - 1]); // Lower-left diagonal
                }
                dp[i][j] = matrix[i][j] + max;
            }
        }

        // Find the maximum value in the last column
        int maxSum = dp[0][n - 1];
        for (int i = 1; i < m; i++) {
            maxSum = Math.max(maxSum, dp[i][n - 1]);
        }

        return maxSum;
    }
}
