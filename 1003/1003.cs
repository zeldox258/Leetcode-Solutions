public class Solution {
    public int CheckIfWordIsValidAfterSubstit(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}