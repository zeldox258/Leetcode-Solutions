
class Solution {
    public String tictactoe(int[][] moves) {
        int[][] board=new int[3][3];
        for(int i=0;i<moves.length;i++) board[moves[i][0]][moves[i][1]]=i%2==0?1:2;
        for(int p=1;p<=2;p++){
            for(int i=0;i<3;i++) if((board[i][0]==p&&board[i][1]==p&&board[i][2]==p)||(board[0][i]==p&&board[1][i]==p&&board[2][i]==p)) return p==1?"A":"B";
            if((board[0][0]==p&&board[1][1]==p&&board[2][2]==p)||(board[0][2]==p&&board[1][1]==p&&board[2][0]==p)) return p==1?"A":"B";
        }
        return moves.length==9?"Draw":"Pending";
    }
}
