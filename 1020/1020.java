
class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length,n=grid[0].length; for(int i=0;i<m;i++) for(int j=0;j<n;j++) if((i==0||i==m-1||j==0||j==n-1)&&grid[i][j]==1) dfs(grid,i,j,m,n);
        int cnt=0; for(int[]row:grid) for(int v:row) if(v==1) cnt++; return cnt;
    }
    void dfs(int[][]g,int i,int j,int m,int n){if(i<0||j<0||i>=m||j>=n||g[i][j]!=1)return;g[i][j]=0;dfs(g,i+1,j,m,n);dfs(g,i-1,j,m,n);dfs(g,i,j+1,m,n);dfs(g,i,j-1,m,n);}
}
