public class Solution {
    public int LengthOfLastWord(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}