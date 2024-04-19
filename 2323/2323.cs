public class Solution {
    public int FindMinimumTimeToFinishAllJobs(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}