public class Solution {
    public int ReverseLettersThenSpecialChara(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}