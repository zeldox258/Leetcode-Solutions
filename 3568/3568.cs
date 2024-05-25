public class Solution {
    public int MinimumMovesToCleanTheClassroo(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}