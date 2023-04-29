public class Solution {
    public int FindTheChildWhoHasTheBallAfter(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}