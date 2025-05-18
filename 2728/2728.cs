public class Solution {
    public int CountHousesInACircularStreet(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}