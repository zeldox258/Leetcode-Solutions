public class Solution {
    public int ArrayReduceTransformation(int[] nums) {
        int l = 0, r = nums.Length - 1, res = 0;
        while (l < r) {
            res = Math.Max(res, Math.Min(nums[l], nums[r]) * (r - l));
            if (nums[l] < nums[r]) l++; else r--;
        }
        return res;
    }
}