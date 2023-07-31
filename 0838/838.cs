public class Solution {
    public int PushDominoes(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}