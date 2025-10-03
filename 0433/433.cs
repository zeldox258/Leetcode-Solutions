public class Solution {
    public int MinimumGeneticMutation(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}