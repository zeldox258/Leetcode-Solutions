public class Solution {
    public int AmountOfNewAreaPaintedEachDay(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}