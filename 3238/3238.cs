public class Solution {
    public int FindTheNumberOfWinningPlayers(int[] nums, int k) {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}