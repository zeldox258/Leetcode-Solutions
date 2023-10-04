public class Solution {
    public int RemoveAllOnesWithRowAndColumnF(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}