
import java.util.*;
class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m=heightMap.length,n=heightMap[0].length; if(m<3||n<3) return 0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){pq.offer(new int[]{heightMap[i][0],i,0});pq.offer(new int[]{heightMap[i][n-1],i,n-1});visited[i][0]=visited[i][n-1]=true;}
        for(int j=1;j<n-1;j++){pq.offer(new int[]{heightMap[0][j],0,j});pq.offer(new int[]{heightMap[m-1][j],m-1,j});visited[0][j]=visited[m-1][j]=true;}
        int res=0; int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
        while(!pq.isEmpty()){int[] cur=pq.poll();for(int[] d:dirs){int x=cur[1]+d[0],y=cur[2]+d[1];if(x>=0&&x<m&&y>=0&&y<n&&!visited[x][y]){visited[x][y]=true;res+=Math.max(0,cur[0]-heightMap[x][y]);pq.offer(new int[]{Math.max(cur[0],heightMap[x][y]),x,y});}}}
        return res;
    }
}
