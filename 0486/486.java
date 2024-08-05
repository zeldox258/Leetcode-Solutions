
class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[] dp = Arrays.copyOf(nums, n);
        for (int len = 2; len <= n; len++)
            for (int i = 0; i <= n - len; i++)
                dp[i] = Math.max(nums[i] - dp[i+1], nums[i+len-1] - dp[i]);
        return dp[0] >= 0;
    }
}
