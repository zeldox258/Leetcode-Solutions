public class Solution {
    public int GetTheSizeOfADataframe(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}