
class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length,n=grid[0].length,fresh=0,time=0; java.util.Queue<int[]>q=new java.util.LinkedList<>();
        for(int i=0;i<m;i++) for(int j=0;j<n;j++){if(grid[i][j]==2)q.offer(new int[]{i,j});if(grid[i][j]==1)fresh++;}
        int[][]dirs={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()&&fresh>0){time++;int sz=q.size();while(sz-->0){int[]c=q.poll();for(int[]d:dirs){int x=c[0]+d[0],y=c[1]+d[1];if(x>=0&&y>=0&&x<m&&y<n&&grid[x][y]==1){grid[x][y]=2;fresh--;q.offer(new int[]{x,y});}}}}
        return fresh==0?time:-1;
    }
}
