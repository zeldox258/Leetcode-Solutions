
class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] dp = new int[n][n];
        for (int[] row : dp) Arrays.fill(row, n);
        Set<Integer> mineSet = new HashSet<>();
        for (int[] m : mines) mineSet.add(m[0] * n + m[1]);
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) { cnt = mineSet.contains(i*n+j) ? 0 : cnt+1; dp[i][j] = Math.min(dp[i][j], cnt); }
            cnt = 0;
            for (int j = n-1; j >= 0; j--) { cnt = mineSet.contains(i*n+j) ? 0 : cnt+1; dp[i][j] = Math.min(dp[i][j], cnt); }
        }
        int res = 0;
        for (int j = 0; j < n; j++) {
            int cnt = 0;
            for (int i = 0; i < n; i++) { cnt = mineSet.contains(i*n+j) ? 0 : cnt+1; dp[i][j] = Math.min(dp[i][j], cnt); }
            cnt = 0;
            for (int i = n-1; i >= 0; i--) { cnt = mineSet.contains(i*n+j) ? 0 : cnt+1; dp[i][j] = Math.min(dp[i][j], cnt); res = Math.max(res, dp[i][j]); }
        }
        return res;
    }
}
