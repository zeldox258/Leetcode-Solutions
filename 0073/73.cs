public class Solution {
    public int SetMatrixZeroes(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}