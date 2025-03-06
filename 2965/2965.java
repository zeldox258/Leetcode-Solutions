class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[] = new int[2];

        int n = grid.length;
        int m = grid[0].length;
        int cnt[] = new int[n * m + 1];

        // Count occurrences of each number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] >= 1 && grid[i][j] <= n * m) {
                    cnt[grid[i][j]]++;
                }
            }
        }

        // Find missing and repeated values
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] == 0) {
                ans[1] = i; // Missing value
            } else if (cnt[i] > 1) {
                ans[0] = i; // Repeated value
            }

            // Exit early if both values are found
            if (ans[0] != 0 && ans[1] != 0) {
                break;
            }
        }

        return ans;
    }
}