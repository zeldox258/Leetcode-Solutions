public class Solution {
    public int RectangleArea(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}