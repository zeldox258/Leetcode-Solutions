public class Solution {
    public int MinimumTimeToFinishTheRace(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}