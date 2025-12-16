public class Solution {
    public int MostFrequentSubtreeSum(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}