public class Solution {
    public int FrogJump(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}