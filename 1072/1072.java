class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        // duplicate rows and flip duplicate rows!!! So each row do ^ with last cell
        int n = matrix.length, m = matrix[0].length, res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (matrix[i][m - 1] == 1)
                for (int j = 0; j < m; j++)
                    matrix[i][j] ^= matrix[i][m - 1];
            res = Math.max(res, map.merge(Arrays.hashCode(matrix[i]), 1, Integer::sum));
        }
        return res;
    }
}