
class Solution {
    public int numRookCaptures(char[][] board) {
        int r=-1,c=-1; for(int i=0;i<8;i++) for(int j=0;j<8;j++) if(board[i][j]=='R'){r=i;c=j;}
        int res=0; int[][]dirs={{0,1},{0,-1},{1,0},{-1,0}};
        for(int[]d:dirs){int x=r+d[0],y=c+d[1];while(x>=0&&y>=0&&x<8&&y<8){if(board[x][y]=='B')break;if(board[x][y]=='p'){res++;break;}x+=d[0];y+=d[1];}}
        return res;
    }
}
