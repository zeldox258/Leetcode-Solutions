public class Solution {
    public int IntegerBreak(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}