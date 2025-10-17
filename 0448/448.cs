public class Solution {
    public int FindAllNumbersDisappearedInAnA(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}