public class Solution {
    public int NumberOfPairsOfStringsWithConc(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}