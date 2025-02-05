public class Solution {
    public int Memoize(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}