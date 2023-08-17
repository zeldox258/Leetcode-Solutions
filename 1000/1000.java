
class Solution {
    public int mergeStones(int[] stones, int k) {
        int n=stones.length; if((n-1)%(k-1)!=0) return -1;
        int[]pre=new int[n+1]; for(int i=0;i<n;i++) pre[i+1]=pre[i]+stones[i];
        int[][][]dp=new int[n][n][k+1]; for(int[][]a:dp) for(int[]b:a) java.util.Arrays.fill(b,Integer.MAX_VALUE);
        for(int i=0;i<n;i++) dp[i][i][1]=0;
        for(int len=2;len<=n;len++) for(int i=0;i<=n-len;i++){int j=i+len-1;for(int m=2;m<=k;m++) for(int mid=i;mid<j;mid++) if(dp[i][mid][1]!=Integer.MAX_VALUE&&dp[mid+1][j][m-1]!=Integer.MAX_VALUE) dp[i][j][m]=Math.min(dp[i][j][m],dp[i][mid][1]+dp[mid+1][j][m-1]);if(dp[i][j][k]!=Integer.MAX_VALUE)dp[i][j][1]=dp[i][j][k]+pre[j+1]-pre[i];}
        return dp[0][n-1][1]==Integer.MAX_VALUE?-1:dp[0][n-1][1];
    }
}
