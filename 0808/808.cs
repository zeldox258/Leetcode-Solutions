public class Solution {
    public int SoupServings(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}