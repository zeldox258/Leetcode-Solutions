public class Solution {
    public int FindTheDegreeOfEachVertex(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}