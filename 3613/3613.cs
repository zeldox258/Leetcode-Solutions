public class Solution {
    public int MinimizeMaximumComponentCost(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}