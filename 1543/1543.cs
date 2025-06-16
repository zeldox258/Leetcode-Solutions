public class Solution {
    public int FixProductNameFormat(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}