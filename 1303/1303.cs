public class Solution {
    public int FindTheTeamSize(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}