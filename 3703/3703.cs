public class Solution {
    public int RemoveKbalancedSubstrings(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}