public class Solution {
    public int FindTheLastMarkedNodesInTree(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}