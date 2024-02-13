
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] rowMax = new int[n], colMax = new int[n];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) {
            rowMax[i] = Math.max(rowMax[i], grid[i][j]);
            colMax[j] = Math.max(colMax[j], grid[i][j]);
        }
        int res = 0;
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) res += Math.min(rowMax[i], colMax[j]) - grid[i][j];
        return res;
    }
}
