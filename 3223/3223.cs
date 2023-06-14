public class Solution {
    public int MinimumLengthOfStringAfterOper(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}