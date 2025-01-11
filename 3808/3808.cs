public class Solution {
    public int FindEmotionallyConsistentUsers(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}