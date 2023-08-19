public class Solution {
    public int SubstringsThatBeginAndEndWithT(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}