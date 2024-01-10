
class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) if (grid[i][0] == 0) for (int j = 0; j < n; j++) grid[i][j] ^= 1;
        for (int j = 1; j < n; j++) {
            int ones = 0; for (int[] row : grid) ones += row[j];
            if (ones < m - ones) for (int[] row : grid) row[j] ^= 1;
        }
        int res = 0;
        for (int[] row : grid) for (int v : row) res = res * 2 + v;
        // Actually compute properly
        res = 0;
        for (int[] row : grid) { int val = 0; for (int v : row) val = val * 2 + v; res += val; }
        return res;
    }
}
