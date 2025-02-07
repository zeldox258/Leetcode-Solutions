public class Solution {
    public int ValidPhoneNumbers(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}