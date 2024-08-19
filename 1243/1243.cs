public class Solution {
    public int ArrayTransformation(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}