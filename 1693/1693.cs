public class Solution {
    public int DailyLeadsAndPartners(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}