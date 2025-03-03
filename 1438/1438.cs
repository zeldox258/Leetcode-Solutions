public class Solution {
    public int LongestContinuousSubarrayWithA(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}