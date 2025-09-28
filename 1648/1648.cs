public class Solution {
    public int SellDiminishingvaluedColoredBa(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}