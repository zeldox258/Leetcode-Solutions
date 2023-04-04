
class Solution {
    public int maxDistance(int[][] grid) {
        int n=grid.length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) if(grid[i][j]==1) q.offer(new int[]{i,j});
        if(q.isEmpty()||q.size()==n*n) return -1;
        int dist=-1;
        int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            dist++;
            int sz=q.size();
            for(int k=0;k<sz;k++){
                int[] cur=q.poll();
                for(int[] d:dirs){
                    int nr=cur[0]+d[0],nc=cur[1]+d[1];
                    if(nr>=0&&nr<n&&nc>=0&&nc<n&&grid[nr][nc]==0){grid[nr][nc]=1;q.offer(new int[]{nr,nc});}
                }
            }
        }
        return dist;
    }
}
