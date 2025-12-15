public class Solution {
    public int SeparateBlackAndWhiteBalls(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}