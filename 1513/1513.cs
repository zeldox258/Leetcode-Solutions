public class Solution {
    public int NumberOfSubstringsWithOnly1s(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}