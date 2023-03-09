public class Solution {
    public int KthSmallestSubarraySum(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}