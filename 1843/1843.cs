public class Solution {
    public int SuspiciousBankAccounts(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}