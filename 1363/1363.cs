public class Solution {
    public int LargestMultipleOfThree(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}