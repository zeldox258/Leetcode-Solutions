public class Solution {
    public int FindTheLengthOfTheLongestCommo(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}