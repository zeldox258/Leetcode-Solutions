public class Solution {
    public int MaximumSumOfAnHourglass(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}