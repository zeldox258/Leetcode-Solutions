class Solution {
    public boolean canMakeSquare(char[][] grid) {
        return change(grid, 0, 0) || change(grid, 0, 1) 
        || change(grid, 1, 0) || change(grid, 1, 1);
    }

    private boolean change(char[][] grid, int x, int y) {
        char[] colors = {grid[x][y], grid[x][y + 1], grid[x + 1][y], grid[x + 1][y + 1]};
        int countB = 0;
        int countW = 0;
        for (char c : colors) {
            if (c == 'B')
                countB++;
            else
                countW++;
        }
        return countB >= 3 || countW >= 3;
    }
}