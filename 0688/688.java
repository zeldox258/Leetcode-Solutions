
class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        int[][] dirs = {{-2,-1},{-2,1},{-1,-2},{-1,2},{1,-2},{1,2},{2,-1},{2,1}};
        double[][] dp = new double[n][n];
        dp[row][column] = 1;
        for (int step = 0; step < k; step++) {
            double[][] next = new double[n][n];
            for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) {
                if (dp[i][j] == 0) continue;
                for (int[] d : dirs) {
                    int ni = i + d[0], nj = j + d[1];
                    if (ni >= 0 && ni < n && nj >= 0 && nj < n) next[ni][nj] += dp[i][j] / 8.0;
                }
            }
            dp = next;
        }
        double sum = 0;
        for (double[] row2 : dp) for (double v : row2) sum += v;
        return sum;
    }
}
