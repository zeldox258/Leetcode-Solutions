public class Solution {
    public int AntOnTheBoundary(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}