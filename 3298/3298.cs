public class Solution {
    public int CountSubstringsThatCanBeRearra(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}