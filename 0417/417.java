
import java.util.*;
class Solution {
    int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
    int m,n;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m=heights.length;n=heights[0].length;
        boolean[][] pac=new boolean[m][n],atl=new boolean[m][n];
        Queue<int[]> pq=new LinkedList<>(),aq=new LinkedList<>();
        for(int i=0;i<m;i++){pq.offer(new int[]{i,0});aq.offer(new int[]{i,n-1});pac[i][0]=true;atl[i][n-1]=true;}
        for(int j=0;j<n;j++){pq.offer(new int[]{0,j});aq.offer(new int[]{m-1,j});pac[0][j]=true;atl[m-1][j]=true;}
        bfs(heights,pq,pac);bfs(heights,aq,atl);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<m;i++) for(int j=0;j<n;j++) if(pac[i][j]&&atl[i][j]) res.add(Arrays.asList(i,j));
        return res;
    }
    void bfs(int[][] h,Queue<int[]> q,boolean[][] visited){
        while(!q.isEmpty()){int[] cur=q.poll();for(int[] d:dirs){int x=cur[0]+d[0],y=cur[1]+d[1];if(x>=0&&x<m&&y>=0&&y<n&&!visited[x][y]&&h[x][y]>=h[cur[0]][cur[1]]){visited[x][y]=true;q.offer(new int[]{x,y});}}}
    }
}
