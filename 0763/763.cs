public class Solution {
    public int PartitionLabels(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}