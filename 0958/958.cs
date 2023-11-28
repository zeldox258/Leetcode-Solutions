public class Solution {
    public int CheckCompletenessOfABinaryTree(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}