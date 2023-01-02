
class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
        if(n<d) return -1;
        int[][] dp=new int[d+1][n+1];
        for(int[] row:dp) Arrays.fill(row,Integer.MAX_VALUE/2);
        dp[0][0]=0;
        for(int i=1;i<=d;i++) for(int j=i;j<=n;j++){
            int maxD=0;
            for(int k=j;k>=i;k--){
                maxD=Math.max(maxD,jobDifficulty[k-1]);
                if(dp[i-1][k-1]<Integer.MAX_VALUE/2)
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][k-1]+maxD);
            }
        }
        return dp[d][n]==Integer.MAX_VALUE/2?-1:dp[d][n];
    }
}
