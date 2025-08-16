public class Solution {
    public int ApplyOperationsToMaximizeScore(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}