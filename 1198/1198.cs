public class Solution {
    public int FindSmallestCommonElementInAll(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}