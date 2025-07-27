
class NumMatrix {
    int[][] tree, nums;
    int m, n;
    public NumMatrix(int[][] matrix) {
        m = matrix.length; n = matrix[0].length;
        tree = new int[m+1][n+1]; nums = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) update(i, j, matrix[i][j]);
    }
    public void update(int r, int c, int val) {
        int diff = val - nums[r][c]; nums[r][c] = val;
        for (int i=r+1;i<=m;i+=i&(-i))
            for (int j=c+1;j<=n;j+=j&(-j)) tree[i][j]+=diff;
    }
    public int sumRegion(int r1, int c1, int r2, int c2) {
        return query(r2+1,c2+1)-query(r1,c2+1)-query(r2+1,c1)+query(r1,c1);
    }
    int query(int r, int c) {
        int s=0;
        for (int i=r;i>0;i-=i&(-i))
            for (int j=c;j>0;j-=j&(-j)) s+=tree[i][j];
        return s;
    }
}
