public class Solution {
    public int CountSubarraysWithMedianK(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}