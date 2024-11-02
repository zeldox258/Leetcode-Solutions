public class Solution {
    public int MergeSortedArray(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}