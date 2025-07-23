
class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+2];
        arr[0] = arr[n+1] = 1;
        for (int i=0;i<n;i++) arr[i+1]=nums[i];
        int[][] dp = new int[n+2][n+2];
        for (int len=1;len<=n;len++)
            for (int l=1;l+len-1<=n;l++) {
                int r = l+len-1;
                for (int k=l;k<=r;k++)
                    dp[l][r] = Math.max(dp[l][r], dp[l][k-1]+arr[l-1]*arr[k]*arr[r+1]+dp[k+1][r]);
            }
        return dp[1][n];
    }
}
