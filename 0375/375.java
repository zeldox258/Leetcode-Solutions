
class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp=new int[n+2][n+2];
        for(int len=2;len<=n;len++)
            for(int l=1;l+len-1<=n;l++){
                int r=l+len-1; dp[l][r]=Integer.MAX_VALUE;
                for(int k=l;k<=r;k++)
                    dp[l][r]=Math.min(dp[l][r],k+Math.max(k>l?dp[l][k-1]:0,k<r?dp[k+1][r]:0));
            }
        return dp[1][n];
    }
}
