public class Solution {
    public int MinimumSumOfMountainTripletsI(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}