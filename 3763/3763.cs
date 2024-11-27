public class Solution {
    public int MaximumTotalSumWithThresholdCo(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}