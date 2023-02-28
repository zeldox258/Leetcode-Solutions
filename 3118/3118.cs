public class Solution {
    public int FridayPurchaseIii(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}