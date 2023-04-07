public class Solution {
    public int DeleteDuplicateFoldersInSystem(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}