public class Solution {
    public int HeightOfSpecialBinaryTree(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}