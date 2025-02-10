public class Solution {
    public int WeightedWordMapping(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}