
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        for (int i = 1; i < n; i++) for (int j = 0; j < n; j++) {
            int best = matrix[i-1][j];
            if (j > 0) best = Math.min(best, matrix[i-1][j-1]);
            if (j < n-1) best = Math.min(best, matrix[i-1][j+1]);
            matrix[i][j] += best;
        }
        int res = Integer.MAX_VALUE; for (int v : matrix[n-1]) res = Math.min(res, v); return res;
    }
}
