public class Solution {
    public int RemoveColoredPiecesIfBothNeigh(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}