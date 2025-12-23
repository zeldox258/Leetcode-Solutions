public class Solution {
    public int FindKthLargestXorCoordinateVal(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}