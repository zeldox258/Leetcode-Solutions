public class Solution {
    public int MinimumCostToBuyApples(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}