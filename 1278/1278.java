
class Solution {
    public int palindromePartition(String s, int k) {
        int n=s.length();
        int[][] cost=new int[n][n];
        for(int len=2;len<=n;len++) for(int i=0;i<=n-len;i++){
            int j=i+len-1;
            cost[i][j]=(s.charAt(i)!=s.charAt(j)?1:0)+(len>2?cost[i+1][j-1]:0);
        }
        int[][] dp=new int[k+1][n+1];
        for(int[] row:dp) Arrays.fill(row,Integer.MAX_VALUE/2);
        dp[0][0]=0;
        for(int p=1;p<=k;p++) for(int i=p;i<=n;i++) for(int j=p-1;j<i;j++)
            dp[p][i]=Math.min(dp[p][i],dp[p-1][j]+cost[j][i-1]);
        return dp[k][n];
    }
}
