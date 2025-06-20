public class Solution {
    public int OddEvenLinkedList(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}