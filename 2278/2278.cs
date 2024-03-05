public class Solution {
    public int PercentageOfLetterInString(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}