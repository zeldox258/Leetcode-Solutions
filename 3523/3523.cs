public class Solution {
    public int MakeArrayNondecreasing(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}