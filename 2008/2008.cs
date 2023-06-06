public class Solution {
    public int MaximumEarningsFromTaxi(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}