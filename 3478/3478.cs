public class Solution {
    public int ChooseKElementsWithMaximumSum(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}