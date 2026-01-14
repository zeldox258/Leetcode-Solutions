class Solution {
    public void solve(char[][] board) {
        int m=board.length,n=board[0].length;
        for(int i=0;i<m;i++){dfs(board,i,0,m,n);dfs(board,i,n-1,m,n);}
        for(int j=0;j<n;j++){dfs(board,0,j,m,n);dfs(board,m-1,j,m,n);}
        for(int i=0;i<m;i++) for(int j=0;j<n;j++){
            if(board[i][j]=='O') board[i][j]='X';
            else if(board[i][j]=='S') board[i][j]='O';
        }
    }
    void dfs(char[][] b,int i,int j,int m,int n){
        if(i<0||i>=m||j<0||j>=n||b[i][j]!='O') return;
        b[i][j]='S';dfs(b,i+1,j,m,n);dfs(b,i-1,j,m,n);dfs(b,i,j+1,m,n);dfs(b,i,j-1,m,n);
    }
}