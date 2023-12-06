
class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] res = new int[rows * cols][2];
        int r = rStart, c = cStart, idx = 0;
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        int steps = 1, dir = 0;
        res[idx++] = new int[]{r, c};
        while (idx < rows * cols) {
            for (int d = 0; d < 2; d++) {
                for (int i = 0; i < steps; i++) {
                    r += dirs[dir][0]; c += dirs[dir][1];
                    if (r >= 0 && r < rows && c >= 0 && c < cols) res[idx++] = new int[]{r, c};
                }
                dir = (dir + 1) % 4;
            }
            steps++;
        }
        return res;
    }
}
