public class Solution {
    public int IslandPerimeter(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}