public class Solution {
    public int MinimumNumberOfOperationsToMak(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}