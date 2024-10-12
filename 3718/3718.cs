public class Solution {
    public int SmallestMissingMultipleOfK(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}