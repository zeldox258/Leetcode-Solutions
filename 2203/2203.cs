public class Solution {
    public int MinimumWeightedSubgraphWithThe(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}