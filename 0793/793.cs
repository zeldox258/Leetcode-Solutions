public class Solution {
    public int PreimageSizeOfFactorialZeroesF(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}