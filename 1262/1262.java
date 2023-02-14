
class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp={0,0,0};
        for(int n:nums){
            int[] tmp=dp.clone();
            for(int v:tmp) dp[(v+n)%3]=Math.max(dp[(v+n)%3],v+n);
        }
        return dp[0];
    }
}
