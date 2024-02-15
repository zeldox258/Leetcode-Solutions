public class Solution {
    public int MovingStonesUntilConsecutive(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}