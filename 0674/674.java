
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res = 1, cur = 1;
        for (int i = 1; i < nums.length; i++) {
            cur = nums[i] > nums[i - 1] ? cur + 1 : 1;
            res = Math.max(res, cur);
        }
        return res;
    }
}
