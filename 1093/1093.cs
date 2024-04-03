public class Solution {
    public int StatisticsFromALargeSample(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}