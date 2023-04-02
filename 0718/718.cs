public class Solution {
    public int MaximumLengthOfRepeatedSubarra(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}