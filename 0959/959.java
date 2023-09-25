
class Solution {
    public int regionsBySlashes(String[] grid) {
        int n=grid.length,N=n*3; int[][]g=new int[N][N];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++){if(grid[i].charAt(j)=='/'){g[i*3][j*3+2]=1;g[i*3+1][j*3+1]=1;g[i*3+2][j*3]=1;}else if(grid[i].charAt(j)=='\'){g[i*3][j*3]=1;g[i*3+1][j*3+1]=1;g[i*3+2][j*3+2]=1;}}
        int res=0; for(int i=0;i<N;i++) for(int j=0;j<N;j++) if(g[i][j]==0){dfs(g,i,j,N);res++;} return res;
    }
    void dfs(int[][]g,int i,int j,int n){if(i<0||j<0||i>=n||j>=n||g[i][j]!=0)return;g[i][j]=1;dfs(g,i+1,j,n);dfs(g,i-1,j,n);dfs(g,i,j+1,n);dfs(g,i,j-1,n);}
}
