public class Solution {
    public int GrandSlamTitles(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}