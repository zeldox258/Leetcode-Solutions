public class Solution {
    public int BinaryTreesWithFactors(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}