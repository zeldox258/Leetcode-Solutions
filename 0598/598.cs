public class Solution {
    public int RangeAdditionIi(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}