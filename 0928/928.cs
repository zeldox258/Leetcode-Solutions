public class Solution {
    public int MinimizeMalwareSpreadIi(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}