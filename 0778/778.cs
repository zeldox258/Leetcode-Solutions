public class Solution {
    public int SwimInRisingWater(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}