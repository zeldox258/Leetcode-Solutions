public class Solution {
    public int NumberOfSubsequencesThatSatisf(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}