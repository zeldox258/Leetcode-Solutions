public class Solution {
    public int KthAncestorOfATreeNode(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}