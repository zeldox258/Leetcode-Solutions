
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) for (int j = 0; j < grid[0].length; j++)
            res = Math.max(res, dfs(grid, i, j));
        return res;
    }
    int dfs(int[][] g, int i, int j) {
        if (i < 0 || i >= g.length || j < 0 || j >= g[0].length || g[i][j] == 0) return 0;
        g[i][j] = 0;
        return 1 + dfs(g, i+1, j) + dfs(g, i-1, j) + dfs(g, i, j+1) + dfs(g, i, j-1);
    }
}
