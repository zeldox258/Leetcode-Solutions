public class Solution {
    public int LowestCommonAncestorOfDeepestL(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}