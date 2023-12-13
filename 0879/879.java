
class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int MOD = 1_000_000_007, k = group.length;
        int[][] dp = new int[n + 1][minProfit + 1];
        dp[0][0] = 1;
        for (int i = 0; i < k; i++) {
            int g = group[i], p = profit[i];
            for (int j = n; j >= g; j--) for (int l = minProfit; l >= 0; l--) {
                dp[j][Math.min(minProfit, l + p)] = (dp[j][Math.min(minProfit, l + p)] + dp[j - g][l]) % MOD;
            }
        }
        int res = 0; for (int j = 0; j <= n; j++) res = (res + dp[j][minProfit]) % MOD;
        return res;
    }
}
