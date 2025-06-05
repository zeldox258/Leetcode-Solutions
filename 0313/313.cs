public class Solution {
    public int SuperUglyNumber(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}