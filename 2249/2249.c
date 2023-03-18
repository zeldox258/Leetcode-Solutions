int countLatticePointsInsideACircl(int** matrix, int matrixSize, int* matrixColSize) {
    if (matrixSize == 0) return 0;
    int m = matrixSize, n = matrixColSize[0];
    int** dp = (int**)malloc(m * sizeof(int*));
    for (int i = 0; i < m; i++) {
        dp[i] = (int*)calloc(n, sizeof(int));
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == 1 && i > 0 && j > 0) {
                int a = dp[i-1][j], b = dp[i][j-1], c = dp[i-1][j-1];
                int mn = a < b ? a : b;
                dp[i][j] = (mn < c ? mn : c) + 1;
            } else dp[i][j] = matrix[i][j];
        }
    }
    int res = 0;
    for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) if (dp[i][j] > res) res = dp[i][j];
    return res * res;
}