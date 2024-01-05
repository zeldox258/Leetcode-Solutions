public class Solution {
    public int MaximumValueOfKCoinsFromPiles(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}