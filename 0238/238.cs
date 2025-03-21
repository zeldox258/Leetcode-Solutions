public class Solution {
    public int ProductOfArrayExceptSelf(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}