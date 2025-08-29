public class Solution {
    public int MaximumFontToFitASentenceInASc(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}