class Solution {
    public int solve2314(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++) dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
        int max=dp[0];
        for(int x:dp) max=Math.max(max,x);
        return max;
    }
}