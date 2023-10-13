public class Solution {
    public int CatAndMouse(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}