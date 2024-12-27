public class Solution {
    public int FindUsersWithHighTokenUsage(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}