public class Solution {
    public int CountTheNumberOfInversions(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}