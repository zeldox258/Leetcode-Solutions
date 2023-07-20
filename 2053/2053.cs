public class Solution {
    public int KthDistinctStringInAnArray(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}