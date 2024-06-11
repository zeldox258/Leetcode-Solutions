
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length, l = -1, r = -1;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] < max) r = i; else max = nums[i];
        }
        for (int i = n-1; i >= 0; i--) {
            if (nums[i] > min) l = i; else min = nums[i];
        }
        return r == -1 ? 0 : r - l + 1;
    }
}
