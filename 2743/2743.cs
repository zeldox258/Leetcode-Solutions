public class Solution {
    public int CountSubstringsWithoutRepeatin(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}