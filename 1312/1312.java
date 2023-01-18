
class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int len=2;len<=n;len++) for(int i=0;i<=n-len;i++){
            int j=i+len-1;
            dp[i][j]=s.charAt(i)==s.charAt(j)?dp[i+1][j-1]:Math.min(dp[i+1][j],dp[i][j-1])+1;
        }
        return dp[0][n-1];
    }
}
