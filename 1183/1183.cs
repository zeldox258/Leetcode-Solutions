public class Solution {
    public int MaximumNumberOfOnes(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}