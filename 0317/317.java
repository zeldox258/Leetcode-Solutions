
import java.util.*;
class Solution {
    public int shortestDistance(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int[][] dist = new int[m][n], reach = new int[m][n];
        int buildingCount = 0;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        for (int i=0;i<m;i++) for (int j=0;j<n;j++) if (grid[i][j]==1) {
            buildingCount++;
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{i,j,0});
            boolean[][] visited = new boolean[m][n];
            visited[i][j]=true;
            while (!q.isEmpty()) {
                int[] cur=q.poll();
                for (int[] d:dirs) {
                    int x=cur[0]+d[0], y=cur[1]+d[1];
                    if (x>=0&&x<m&&y>=0&&y<n&&!visited[x][y]&&grid[x][y]==0) {
                        visited[x][y]=true; dist[x][y]+=cur[2]+1; reach[x][y]++;
                        q.offer(new int[]{x,y,cur[2]+1});
                    }
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i=0;i<m;i++) for (int j=0;j<n;j++)
            if (grid[i][j]==0&&reach[i][j]==buildingCount) res=Math.min(res,dist[i][j]);
        return res==Integer.MAX_VALUE?-1:res;
    }
}
