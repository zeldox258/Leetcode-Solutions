public class Solution {
    public int CountMentionsPerUser(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}