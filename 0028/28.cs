public class Solution {
    public int FindTheIndexOfTheFirstOccurren(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}