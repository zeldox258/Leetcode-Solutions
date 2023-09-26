public class Solution {
    public int FindCitiesInEachStateIi(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}