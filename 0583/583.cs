public class Solution {
    public int DeleteOperationForTwoStrings(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}