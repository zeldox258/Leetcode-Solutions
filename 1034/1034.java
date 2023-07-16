
class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int m=grid.length,n=grid[0].length,orig=grid[row][col]; boolean[][]visited=new boolean[m][n];
        java.util.Queue<int[]>q=new java.util.LinkedList<>();q.offer(new int[]{row,col});visited[row][col]=true;
        java.util.List<int[]>border=new java.util.ArrayList<>();int[][]dirs={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){int[]c=q.poll();boolean isBorder=false;for(int[]d:dirs){int x=c[0]+d[0],y=c[1]+d[1];if(x<0||y<0||x>=m||y>=n||grid[x][y]!=orig)isBorder=true;else if(!visited[x][y]){visited[x][y]=true;q.offer(new int[]{x,y});}}if(isBorder)border.add(c);}
        for(int[]b:border)grid[b[0]][b[1]]=color; return grid;
    }
}
