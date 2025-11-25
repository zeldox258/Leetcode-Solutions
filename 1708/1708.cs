public class Solution {
    public int LargestSubarrayLengthK(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}