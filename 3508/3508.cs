public class Solution {
    public int ImplementRouter(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}