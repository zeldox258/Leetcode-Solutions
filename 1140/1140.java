
class Solution {
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        int[] suffix=new int[n+1];
        for(int i=n-1;i>=0;i--) suffix[i]=suffix[i+1]+piles[i];
        int[][] dp=new int[n][n+1];
        for(int i=n-1;i>=0;i--){
            for(int m=1;m<=n;m++){
                if(i+2*m>=n){ dp[i][m]=suffix[i]; continue; }
                for(int x=1;x<=2*m;x++) dp[i][m]=Math.max(dp[i][m],suffix[i]-dp[i+x][Math.max(m,x)]);
            }
        }
        return dp[0][1];
    }
}
