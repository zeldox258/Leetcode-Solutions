class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
        int m=og.length,n=og[0].length;
        long[][] dp=new long[m][n];
        dp[0][0]=og[0][0]==1?0:1;
        for(int i=1;i<m;i++) dp[i][0]=og[i][0]==1?0:dp[i-1][0];
        for(int j=1;j<n;j++) dp[0][j]=og[0][j]==1?0:dp[0][j-1];
        for(int i=1;i<m;i++) for(int j=1;j<n;j++) dp[i][j]=og[i][j]==1?0:dp[i-1][j]+dp[i][j-1];
        return (int)dp[m-1][n-1];
    }
}