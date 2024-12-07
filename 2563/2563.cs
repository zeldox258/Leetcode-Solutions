public class Solution {
    public int CountTheNumberOfFairPairs(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}