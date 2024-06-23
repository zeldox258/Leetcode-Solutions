
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, count = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) { dfs(isConnected, visited, i); count++; }
        }
        return count;
    }
    void dfs(int[][] grid, boolean[] visited, int i) {
        visited[i] = true;
        for (int j = 0; j < grid.length; j++)
            if (!visited[j] && grid[i][j] == 1) dfs(grid, visited, j);
    }
}
