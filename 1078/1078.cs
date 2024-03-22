public class Solution {
    public int OccurrencesAfterBigram(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}