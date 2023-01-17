public class Solution {
    public int MaximumAverageSubarrayI(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}