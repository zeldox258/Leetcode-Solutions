public class Solution {
    public int CalculateOrdersWithinEachInter(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}