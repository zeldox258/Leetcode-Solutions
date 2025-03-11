public class Solution {
    public int MinimumCostToEqualizeArraysUsi(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}