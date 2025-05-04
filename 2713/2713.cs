public class Solution {
    public int MaximumStrictlyIncreasingCells(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}