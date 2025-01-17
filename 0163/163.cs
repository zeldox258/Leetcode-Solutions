public class Solution {
    public int MissingRanges(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}