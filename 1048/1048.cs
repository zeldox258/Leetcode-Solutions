public class Solution {
    public int LongestStringChain(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}