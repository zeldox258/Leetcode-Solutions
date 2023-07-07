
class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;int[]dp=new int[n+1];
        for(int i=1;i<=n;i++){int mx=0;for(int j=1;j<=k&&i-j>=0;j++){mx=Math.max(mx,arr[i-j]);dp[i]=Math.max(dp[i],dp[i-j]+mx*j);}}
        return dp[n];
    }
}
