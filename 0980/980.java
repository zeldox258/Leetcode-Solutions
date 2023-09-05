
class Solution {
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length,n=grid[0].length,start=-1,end=-1,empty=0;
        for(int i=0;i<m;i++) for(int j=0;j<n;j++){if(grid[i][j]!=-1)empty++;if(grid[i][j]==1)start=i*n+j;if(grid[i][j]==2)end=i*n+j;}
        return dfs(grid,start/n,start%n,end/n,end%n,empty,m,n);
    }
    int dfs(int[][]g,int r,int c,int er,int ec,int empty,int m,int n){
        if(r<0||c<0||r>=m||c>=n||g[r][c]==-1) return 0; if(r==er&&c==ec) return empty==1?1:0;
        int tmp=g[r][c];g[r][c]=-1; int res=dfs(g,r+1,c,er,ec,empty-1,m,n)+dfs(g,r-1,c,er,ec,empty-1,m,n)+dfs(g,r,c+1,er,ec,empty-1,m,n)+dfs(g,r,c-1,er,ec,empty-1,m,n); g[r][c]=tmp; return res;
    }
}
