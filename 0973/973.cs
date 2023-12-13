public class Solution {
    public int KClosestPointsToOrigin(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}