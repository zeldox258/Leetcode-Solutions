public class Solution {
    public int MaximumNumberOfPointsFromGridQ(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}