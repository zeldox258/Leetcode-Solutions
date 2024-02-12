public class Solution {
    public int CheckIfDigitsAreEqualInStringA(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}