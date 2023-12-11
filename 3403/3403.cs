public class Solution {
    public int FindTheLexicographicallyLarges(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}