public class Solution {
    public int ReversePairs(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}