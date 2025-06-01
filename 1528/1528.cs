public class Solution {
    public int ShuffleString(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}