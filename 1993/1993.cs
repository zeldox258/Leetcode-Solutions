public class Solution {
    public int OperationsOnTree(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}