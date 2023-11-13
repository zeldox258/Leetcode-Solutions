public class Solution {
    public int FindTheShortestSuperstring(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}