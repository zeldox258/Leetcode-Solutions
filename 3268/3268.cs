public class Solution {
    public int FindOverlappingShiftsIi(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}