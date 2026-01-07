public class Solution {
    public int MaximumScoreFromRemovingStones(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}