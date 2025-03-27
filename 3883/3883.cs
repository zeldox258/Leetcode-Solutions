public class Solution {
    public int CountNonDecreasingArraysWithGi(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}