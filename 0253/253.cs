public class Solution {
    public int MeetingRoomsIi(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}