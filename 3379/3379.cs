public class Solution {
    public int TransformedArray(int[] nums) {
        int max = nums[0], cur = nums[0];
        for (int i = 1; i < nums.Length; i++) {
            cur = Math.Max(nums[i], cur + nums[i]);
            max = Math.Max(max, cur);
        }
        return max;
    }
}