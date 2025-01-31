class Solution {
    // set each island an value start from 2
    // change 1 to 2 or 3 or 4. size[2] is the size of island
    public int largestIsland(int[][] grid) {
        int[] size = new int[2 + grid.length * grid.length];
        int numComp = 2;
        int maxSize = 0;

        for (int row = 0; row < grid.length; ++row) {
            for (int col = 0; col < grid[row].length; ++col) {
                if (grid[row][col] == 1) {
                    size[numComp] = dfs(grid, row, col, numComp);
                    maxSize = Math.max(maxSize, size[numComp]);
                    ++numComp;
                }
            }
        }

        for (int row = 0; row < grid.length; ++row) {
            for (int col = 0; col < grid[row].length; ++col) {
                if (grid[row][col] != 0) {
                    continue;
                }
                int mergedSize = 1;
                int compA = 0;
                int compB = 0;
                int compC = 0;
                if (row > 0) {
                    compA = grid[row - 1][col];
                    mergedSize += size[compA];
                }
                if (col + 1 < grid[row].length && grid[row][col + 1] != compA) {
                    compB = grid[row][col + 1];
                    mergedSize += size[compB];
                }
                if (row + 1 < grid.length && grid[row + 1][col] != compA && grid[row + 1][col] != compB) {
                    compC = grid[row + 1][col];
                    mergedSize += size[compC];
                }
                if (col > 0 && grid[row][col - 1] != compA && grid[row][col - 1] != compB
                        && grid[row][col - 1] != compC) {
                    mergedSize += size[grid[row][col - 1]];
                }
                maxSize = Math.max(maxSize, mergedSize);
            }
        }
        return maxSize;
    }

    private int dfs(int[][] grid, int row, int col, int comp) {
        grid[row][col] = comp;
        int size = 1;
        if (row > 0 && grid[row - 1][col] == 1) {
            size += dfs(grid, row - 1, col, comp);
        }
        if (row + 1 < grid.length && grid[row + 1][col] == 1) {
            size += dfs(grid, row + 1, col, comp);
        }
        if (col > 0 && grid[row][col - 1] == 1) {
            size += dfs(grid, row, col - 1, comp);
        }
        if (col + 1 < grid.length && grid[row][col + 1] == 1) {
            size += dfs(grid, row, col + 1, comp);
        }
        return size;
    }
}