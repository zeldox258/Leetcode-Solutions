class Solution {
     public int[][] onesMinusZeros(int[][] grid) {
        int R = grid.length, C = grid[0].length;
        int[] row = new int[R], col = new int[C]; 
        for (int r = 0; r < R; ++r) {
            for (int c = 0; c < C; ++c) {
                int offset = 2 * grid[r][c] - 1; // grid[r][c] = 1: 1, grid[r][c] = 0: -1.
                row[r] += offset;
                col[c] += offset;
            }
        }
        int[][] ans = new int[R][C];
        for (int r = 0; r < R; ++r) {
            for (int c = 0; c < C; ++c) {
                ans[r][c] = row[r] + col[c];
            }
        }
        return ans;
    }
}