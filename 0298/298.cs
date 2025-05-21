public class Solution {
    public int BinaryTreeLongestConsecutiveSe(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}