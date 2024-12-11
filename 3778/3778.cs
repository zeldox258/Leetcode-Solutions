public class Solution {
    public int MinimumDistanceExcludingOneMax(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}