public class Solution {
    public int FloodFill(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}