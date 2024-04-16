public class Solution {
    public int DefangingAnIpAddress(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}