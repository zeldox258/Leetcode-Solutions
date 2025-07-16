public class Solution {
    public int NumberOfWaysToSplitAString(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}