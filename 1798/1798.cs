public class Solution {
    public int MaximumNumberOfConsecutiveValu(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}