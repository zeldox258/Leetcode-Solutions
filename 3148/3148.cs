public class Solution {
    public int MaximumDifferenceScoreInAGrid(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}