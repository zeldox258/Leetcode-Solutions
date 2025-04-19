public class Solution {
    public int FindThePunishmentNumberOfAnInt(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}