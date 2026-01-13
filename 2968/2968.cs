public class Solution {
    public int ApplyOperationsToMaximizeFrequ(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}