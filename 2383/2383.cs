public class Solution {
    public int MinimumHoursOfTrainingToWinACo(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}