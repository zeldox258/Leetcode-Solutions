public class Solution {
    public int OptimalDivision(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}