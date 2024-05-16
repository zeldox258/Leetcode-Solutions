public class Solution {
    public int AlphabetBoardPath(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}