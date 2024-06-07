public class Solution {
    public int CountSpecialTriplets(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}