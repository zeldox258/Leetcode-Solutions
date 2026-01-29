public class Solution {
    public int PalindromeRearrangementQueries(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}