import java.util.*;
class Solution {
    public void wallsAndGates(int[][] rooms) {
        int m=rooms.length,n=rooms[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++) for(int j=0;j<n;j++) if(rooms[i][j]==0) q.offer(new int[]{i,j});
        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] cur=q.poll();
            for(int[] d:dirs){int r=cur[0]+d[0],c=cur[1]+d[1];if(r>=0&&r<m&&c>=0&&c<n&&rooms[r][c]==Integer.MAX_VALUE){rooms[r][c]=rooms[cur[0]][cur[1]]+1;q.offer(new int[]{r,c});}}
        }
    }
}