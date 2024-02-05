public class Solution {
    public int IntersectionOfMultipleArrays(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}