public class Solution {
    public int CheckWhetherTwoStringsAreAlmos(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}