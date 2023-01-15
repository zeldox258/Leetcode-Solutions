public class Solution {
    public int MaximumIncreasingTripletValue(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}