public class Solution {
    public int PointsThatIntersectWithCars(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}