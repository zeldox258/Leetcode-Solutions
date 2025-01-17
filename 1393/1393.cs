public class Solution {
    public int CapitalGainloss(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}