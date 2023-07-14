public class Solution {
    public int ConstructStringWithMinimumCost(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}