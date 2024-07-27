
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] res = new int[m * n];
        int idx = 0;
        for (int d = 0; d < m + n - 1; d++) {
            if (d % 2 == 0) {
                int r = Math.min(d, m-1), c = d - r;
                while (r >= 0 && c < n) res[idx++] = mat[r--][c++];
            } else {
                int c = Math.min(d, n-1), r = d - c;
                while (c >= 0 && r < m) res[idx++] = mat[r++][c--];
            }
        }
        return res;
    }
}
