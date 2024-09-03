public class Solution {
    public int SynonymousSentences(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}