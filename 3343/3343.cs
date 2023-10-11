public class Solution {
    public int CountNumberOfBalancedPermutati(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}