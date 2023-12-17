public class Solution {
    public int SumOfNumberAndItsReverse(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}