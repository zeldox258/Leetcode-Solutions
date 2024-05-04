public class Solution {
    public int CountTheNumberOfIdealArrays(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}