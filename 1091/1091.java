
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;if(grid[0][0]==1||grid[n-1][n-1]==1)return -1;
        java.util.Queue<int[]>q=new java.util.LinkedList<>();q.offer(new int[]{0,0,1});grid[0][0]=1;
        while(!q.isEmpty()){int[]c=q.poll();if(c[0]==n-1&&c[1]==n-1)return c[2];for(int dr=-1;dr<=1;dr++)for(int dc=-1;dc<=1;dc++){int x=c[0]+dr,y=c[1]+dc;if(x>=0&&y>=0&&x<n&&y<n&&grid[x][y]==0){grid[x][y]=1;q.offer(new int[]{x,y,c[2]+1});}}}
        return -1;
    }
}
