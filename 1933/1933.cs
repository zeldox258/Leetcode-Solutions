public class Solution {
    public int CheckIfStringIsDecomposableInt(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}