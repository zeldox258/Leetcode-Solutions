
class Solution {
    public int minScoreTriangulation(int[] values) {
        int n=values.length;int[][]dp=new int[n][n];
        for(int gap=2;gap<n;gap++)for(int i=0;i+gap<n;i++){int j=i+gap;dp[i][j]=Integer.MAX_VALUE;for(int k=i+1;k<j;k++)dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k][j]+values[i]*values[k]*values[j]);}
        return dp[0][n-1];
    }
}
