public class Solution {
    public int KthLargestElementInAStream(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}