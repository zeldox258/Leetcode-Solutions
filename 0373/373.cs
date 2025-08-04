public class Solution {
    public int FindKPairsWithSmallestSums(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}