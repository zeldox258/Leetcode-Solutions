public class Solution {
    public int MaximumNumberOfMovesToKillAllP(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}