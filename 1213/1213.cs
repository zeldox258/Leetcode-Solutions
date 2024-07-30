public class Solution {
    public int IntersectionOfThreeSortedArray(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}