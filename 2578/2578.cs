public class Solution {
    public int SplitWithMinimumSum(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}