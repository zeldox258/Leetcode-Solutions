public class Solution {
    public int SlidingSubarrayBeauty(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}