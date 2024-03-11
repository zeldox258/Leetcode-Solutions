public class Solution {
    public int PropertiesGraph(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}