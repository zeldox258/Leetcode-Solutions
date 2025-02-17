public class Solution {
    public int MaximumPointsYouCanObtainFromC(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}