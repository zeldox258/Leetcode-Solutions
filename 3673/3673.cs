public class Solution {
    public int FindZombieSessions(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}