public class Solution {
    public int ShortestDistanceInALine(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}