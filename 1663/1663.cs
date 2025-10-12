public class Solution {
    public int SmallestStringWithAGivenNumeri(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}