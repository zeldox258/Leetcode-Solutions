public class Solution {
    public int ShortestCycleInAGraph(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}