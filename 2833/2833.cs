public class Solution {
    public int FurthestPointFromOrigin(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}