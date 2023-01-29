public class Solution {
    public int MakeStringAntipalindrome(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}