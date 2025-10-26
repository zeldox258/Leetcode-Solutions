public class Solution {
    public int GoalParserInterpretation(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}