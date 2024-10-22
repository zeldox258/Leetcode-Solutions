public class Solution {
    public int NumberOfGreatPartitions(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}