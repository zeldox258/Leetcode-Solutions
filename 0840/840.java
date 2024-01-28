
class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int cnt = 0;
        for (int i = 0; i <= grid.length - 3; i++) for (int j = 0; j <= grid[0].length - 3; j++)
            if (isMagic(grid, i, j)) cnt++;
        return cnt;
    }
    boolean isMagic(int[][] g, int r, int c) {
        int[] cnt = new int[10];
        for (int i = r; i < r+3; i++) for (int j = c; j < c+3; j++) {
            int v = g[i][j]; if (v < 1 || v > 9 || cnt[v]++ > 0) return false;
        }
        int s = g[r][c] + g[r][c+1] + g[r][c+2];
        for (int i = 0; i < 3; i++) {
            if (g[r+i][c]+g[r+i][c+1]+g[r+i][c+2] != s) return false;
            if (g[r][c+i]+g[r+1][c+i]+g[r+2][c+i] != s) return false;
        }
        if (g[r][c]+g[r+1][c+1]+g[r+2][c+2] != s) return false;
        if (g[r][c+2]+g[r+1][c+1]+g[r+2][c] != s) return false;
        return true;
    }
}
