public class Solution {
    public int MinimumNumbersOfFunctionCallsT(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}