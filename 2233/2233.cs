public class Solution {
    public int MaximumProductAfterKIncrements(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}