public class Solution {
    public int LongestCommonPrefixBetweenAdja(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}