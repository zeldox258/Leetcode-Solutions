public class Solution {
    public int ReachableNodesWithRestrictions(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}