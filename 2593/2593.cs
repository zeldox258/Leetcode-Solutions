public class Solution {
    public int FindScoreOfAnArrayAfterMarking(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}