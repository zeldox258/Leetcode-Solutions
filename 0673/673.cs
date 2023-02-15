public class Solution {
    public int NumberOfLongestIncreasingSubse(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}