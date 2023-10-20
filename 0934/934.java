
class Solution {
    int[][] grid; int n;
    public int shortestBridge(int[][] grid) {
        this.grid = grid; n = grid.length;
        java.util.Queue<int[]> q = new java.util.LinkedList<>();
        outer: for (int i=0;i<n;i++) for (int j=0;j<n;j++) if (grid[i][j]==1) { dfs(i,j,q); break outer; }
        int steps=0; int[][]dirs={{0,1},{0,-1},{1,0},{-1,0}};
        while (!q.isEmpty()) {
            int sz=q.size(); while (sz-->0) { int[]c=q.poll(); for(int[]d:dirs){ int x=c[0]+d[0],y=c[1]+d[1]; if(x<0||y<0||x>=n||y>=n||grid[x][y]==2)continue; if(grid[x][y]==1)return steps; grid[x][y]=2;q.offer(new int[]{x,y}); } } steps++;
        }
        return -1;
    }
    void dfs(int i,int j,java.util.Queue<int[]>q){ if(i<0||j<0||i>=n||j>=n||grid[i][j]!=1)return; grid[i][j]=2;q.offer(new int[]{i,j}); dfs(i+1,j,q);dfs(i-1,j,q);dfs(i,j+1,q);dfs(i,j-1,q); }
}
