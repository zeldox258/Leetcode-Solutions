public class Solution {
    public int ReplaceEmployeeIdWithTheUnique(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}