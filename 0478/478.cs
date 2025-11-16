public class Solution {
    public int GenerateRandomPointInACircle(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}