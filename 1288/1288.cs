public class Solution {
    public int RemoveCoveredIntervals(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}