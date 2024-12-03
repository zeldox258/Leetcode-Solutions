public class Solution {
    public int PascalsTriangle(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}