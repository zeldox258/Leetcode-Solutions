public class Solution {
    public int CountCompleteSubstrings(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}