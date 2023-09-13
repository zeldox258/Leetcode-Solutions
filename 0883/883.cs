public class Solution {
    public int ProjectionAreaOf3dShapes(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}