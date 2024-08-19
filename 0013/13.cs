public class Solution {
    public int RomanToInteger(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}