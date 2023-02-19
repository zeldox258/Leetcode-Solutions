
class Solution {
    public int closedIsland(int[][] grid) {
        int m=grid.length,n=grid[0].length,res=0;
        for(int i=0;i<m;i++) for(int j=0;j<n;j++) if(i==0||i==m-1||j==0||j==n-1) fill(grid,i,j);
        for(int i=0;i<m;i++) for(int j=0;j<n;j++) if(grid[i][j]==0){fill(grid,i,j);res++;}
        return res;
    }
    void fill(int[][] g,int r,int c){
        if(r<0||r>=g.length||c<0||c>=g[0].length||g[r][c]!=0) return;
        g[r][c]=1; fill(g,r+1,c);fill(g,r-1,c);fill(g,r,c+1);fill(g,r,c-1);
    }
}
