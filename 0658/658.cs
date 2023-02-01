public class Solution {
    public int FindKClosestElements(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}