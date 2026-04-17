public class Solution {
    public int MissingNumberInArithmeticProgr(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}