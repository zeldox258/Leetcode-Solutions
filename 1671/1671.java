class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length, minNoOfRemovals = n;
        int[] lis = new int[n], lds = new int[n];

        // LIS (Longest Increasing Subsequence)
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                if (nums[i] > nums[k]) {
                    lis[i] = Math.max(lis[i], lis[k]);
                }
            }
            lis[i]++;
        }

        // LDS (Longest Decreasing Subsequence)
        for (int i = n - 1; i >= 0; i--) {
            for (int k = n - 1; k > i; k--) {
                if (nums[i] > nums[k]) {
                    lds[i] = Math.max(lds[i], lds[k]);
                }
            }
            lds[i]++;
        }

        // Compute minimum number of removals
        for (int i = 1; i < n - 1; i++) {
            if (lis[i] != 1 && lds[i] != 1) {
                minNoOfRemovals = Math.min(minNoOfRemovals, 1 + n - lis[i] - lds[i]);
            }
        }

        return minNoOfRemovals;
    }
}
