public class Solution {
    public int CarFleet(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}