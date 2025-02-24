public class Solution {
    public int MergeCloseCharacters(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}