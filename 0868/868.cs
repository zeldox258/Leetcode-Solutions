public class Solution {
    public int BinaryGap(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}