public class Solution {
    public int MinMaxGame(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}