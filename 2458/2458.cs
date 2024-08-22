public class Solution {
    public int HeightOfBinaryTreeAfterSubtree(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}