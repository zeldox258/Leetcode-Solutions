public class Solution {
    public int BinaryPrefixDivisibleBy5(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}