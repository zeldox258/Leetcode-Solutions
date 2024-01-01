public class Solution {
    public int SmallestStringStartingFromLeaf(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}