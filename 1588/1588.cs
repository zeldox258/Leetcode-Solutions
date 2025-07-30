public class Solution {
    public int SumOfAllOddLengthSubarrays(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}