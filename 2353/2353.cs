public class Solution {
    public int DesignAFoodRatingSystem(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}