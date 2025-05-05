public class Solution {
    public int MoveZeroes(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}