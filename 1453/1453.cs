public class Solution {
    public int MaximumNumberOfDartsInsideOfAC(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}