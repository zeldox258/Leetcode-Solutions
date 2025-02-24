class Solution {
    public int maxOperations(int[] nums) {
        int ans = 1;
        int sum1 = nums[0] + nums[1];

        for (int i = 2; i < nums.length - 1; i += 2) {
            int sum2 = nums[i] + nums[i + 1];

            if (sum1 == sum2) {
                ans++;
            }else {
                return ans;
            }
        }

        return ans;
    }
}