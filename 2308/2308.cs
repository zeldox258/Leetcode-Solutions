public class Solution {
    public int ArrangeTableByGender(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}