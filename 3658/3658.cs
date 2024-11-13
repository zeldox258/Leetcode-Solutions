public class Solution {
    public int GcdOfOddAndEvenSums(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}