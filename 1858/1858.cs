public class Solution {
    public int LongestWordWithAllPrefixes(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}