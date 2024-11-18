public class Solution {
    public int BinaryTreeZigzagLevelOrderTrav(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}