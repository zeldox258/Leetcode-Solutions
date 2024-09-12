public class Solution {
    public int BitwiseOrOfEvenNumbersInAnArra(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}