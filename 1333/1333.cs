public class Solution {
    public int FilterRestaurantsByVeganfriend(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}