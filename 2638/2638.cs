public class Solution {
    public int CountTheNumberOfKfreeSubsets(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}