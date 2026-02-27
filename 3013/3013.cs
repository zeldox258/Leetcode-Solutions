public class Solution {
    public int DivideAnArrayIntoSubarraysWith(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}