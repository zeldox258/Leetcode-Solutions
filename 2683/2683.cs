public class Solution {
    public int NeighboringBitwiseXor(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}