public class Solution {
    public int MaximumLengthOfSemidecreasingS(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}