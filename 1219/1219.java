
class Solution {
    int[][] grid; int m,n;
    public int getMaximumGold(int[][] grid) {
        this.grid=grid; m=grid.length; n=grid[0].length;
        int res=0;
        for(int i=0;i<m;i++) for(int j=0;j<n;j++) if(grid[i][j]>0) res=Math.max(res,dfs(i,j));
        return res;
    }
    int dfs(int r,int c){
        if(r<0||r>=m||c<0||c>=n||grid[r][c]==0) return 0;
        int val=grid[r][c]; grid[r][c]=0;
        int res=Math.max(Math.max(dfs(r+1,c),dfs(r-1,c)),Math.max(dfs(r,c+1),dfs(r,c-1)))+val;
        grid[r][c]=val; return res;
    }
}
