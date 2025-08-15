class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length,n=board[0].length;
        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        for(int i=0;i<m;i++) for(int j=0;j<n;j++){
            int live=0;
            for(int[] d:dirs){int r=i+d[0],c=j+d[1];if(r>=0&&r<m&&c>=0&&c<n&&(board[r][c]&1)==1)live++;}
            if(board[i][j]==1&&(live==2||live==3)) board[i][j]|=2;
            else if(board[i][j]==0&&live==3) board[i][j]|=2;
        }
        for(int i=0;i<m;i++) for(int j=0;j<n;j++) board[i][j]>>=1;
    }
}