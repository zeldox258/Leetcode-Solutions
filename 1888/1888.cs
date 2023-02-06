public class Solution {
    public int MinimumNumberOfFlipsToMakeTheB(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}