public class Solution {
    public int QueriesOnNumberOfPointsInsideA(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}