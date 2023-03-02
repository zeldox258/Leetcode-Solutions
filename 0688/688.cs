public class Solution {
    public int KnightProbabilityInChessboard(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}