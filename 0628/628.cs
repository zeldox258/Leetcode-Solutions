public class Solution {
    public int MaximumProductOfThreeNumbers(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}