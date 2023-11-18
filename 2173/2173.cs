public class Solution {
    public int LongestWinningStreak(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}