public class Solution {
    public int ChooseNumbersFromTwoArraysInRa(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}