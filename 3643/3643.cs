public class Solution {
    public int FlipSquareSubmatrixVertically(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}