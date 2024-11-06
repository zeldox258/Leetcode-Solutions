public class Solution {
    public int NumberOfGoodBinaryStrings(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}