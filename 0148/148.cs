public class Solution {
    public int SortList(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}