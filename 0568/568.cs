public class Solution {
    public int MaximumVacationDays(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}