public class Solution {
    public int NextDay(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}