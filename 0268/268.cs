public class Solution {
    public int MissingNumber(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}