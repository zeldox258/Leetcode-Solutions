
class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int MOD = 1_000_000_007;
        int[][] dp = new int[m][n];
        dp[startRow][startColumn] = 1;
        int res = 0;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        for (int k = 0; k < maxMove; k++) {
            int[][] ndp = new int[m][n];
            for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) {
                if (dp[i][j] == 0) continue;
                for (int[] d : dirs) {
                    int ni=i+d[0], nj=j+d[1];
                    if (ni<0||ni>=m||nj<0||nj>=n) res=(res+dp[i][j])%MOD;
                    else ndp[ni][nj]=(ndp[ni][nj]+dp[i][j])%MOD;
                }
            }
            dp = ndp;
        }
        return res;
    }
}
