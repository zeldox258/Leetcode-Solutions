public class Solution {
    public int LargestOddNumberInString(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}