
class Solution {
    public int[] movingCount(int m, int rows, int cols) {
        boolean[][]visited=new boolean[rows][cols];
        return new int[]{bfs(rows,cols,m,visited)};
    }
    int bfs(int rows,int cols,int k,boolean[][]visited){
        java.util.Queue<int[]>q=new java.util.LinkedList<>();q.offer(new int[]{0,0});visited[0][0]=true;int cnt=1;
        int[][]dirs={{0,1},{1,0}};
        while(!q.isEmpty()){int[]c=q.poll();for(int[]d:dirs){int x=c[0]+d[0],y=c[1]+d[1];if(x<rows&&y<cols&&!visited[x][y]&&digitSum(x)+digitSum(y)<=k){visited[x][y]=true;cnt++;q.offer(new int[]{x,y});}}}
        return cnt;
    }
    int digitSum(int n){int s=0;while(n>0){s+=n%10;n/=10;}return s;}
}
