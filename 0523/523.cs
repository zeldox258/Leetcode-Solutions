public class Solution {
    public int ContinuousSubarraySum(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}