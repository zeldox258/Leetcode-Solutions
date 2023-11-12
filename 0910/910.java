
class Solution {
    public int smallestRangeII(int[] nums, int k) {
        java.util.Arrays.sort(nums); int n = nums.length, res = nums[n-1] - nums[0];
        for (int i = 0; i < n - 1; i++) {
            int hi = Math.max(nums[n-1] - k, nums[i] + k), lo = Math.min(nums[0] + k, nums[i+1] - k);
            res = Math.min(res, hi - lo);
        }
        return res;
    }
}
