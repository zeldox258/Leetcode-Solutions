
class Solution {
    int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
    int m,n;
    public int longestIncreasingPath(int[][] matrix) {
        m=matrix.length; n=matrix[0].length;
        int[][] memo=new int[m][n]; int res=0;
        for (int i=0;i<m;i++) for (int j=0;j<n;j++) res=Math.max(res,dfs(matrix,i,j,memo));
        return res;
    }
    int dfs(int[][] mat, int i, int j, int[][] memo) {
        if (memo[i][j]!=0) return memo[i][j];
        memo[i][j]=1;
        for (int[] d:dirs) {
            int x=i+d[0],y=j+d[1];
            if (x>=0&&x<m&&y>=0&&y<n&&mat[x][y]>mat[i][j])
                memo[i][j]=Math.max(memo[i][j],1+dfs(mat,x,y,memo));
        }
        return memo[i][j];
    }
}
