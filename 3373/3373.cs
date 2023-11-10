public class Solution {
    public int MaximizeTheNumberOfTargetNodes(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}