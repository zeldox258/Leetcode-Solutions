public class Solution {
    public int DesignParkingSystem(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}