public class Solution {
    public int StringCompressionIii(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}