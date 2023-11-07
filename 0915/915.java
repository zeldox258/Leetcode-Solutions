
class Solution {
    public int[] partitionDisjoint(int[] nums) {
        int n = nums.length, maxLeft = nums[0], curMax = nums[0], idx = 0;
        for (int i = 1; i < n; i++) { curMax = Math.max(curMax, nums[i]); if (nums[i] < maxLeft) { maxLeft = curMax; idx = i; } }
        return new int[]{idx + 1, n - idx - 1};
    }
}
