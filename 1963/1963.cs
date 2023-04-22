public class Solution {
    public int MinimumNumberOfSwapsToMakeTheS(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}