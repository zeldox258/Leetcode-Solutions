public class Solution {
    public int SubsequenceOfSizeKWithTheLarge(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}