public class Solution {
    public int MaximumPriceToFillABag(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}