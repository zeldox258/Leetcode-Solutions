public class Solution {
    public int CalculateSpecialBonus(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}