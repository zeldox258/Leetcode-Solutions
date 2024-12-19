public class Solution {
    public int CloneGraph(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}