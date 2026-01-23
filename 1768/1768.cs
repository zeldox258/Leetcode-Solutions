public class Solution {
    public int MergeStringsAlternately(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}