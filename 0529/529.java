
class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M') { board[click[0]][click[1]] = 'X'; return board; }
        dfs(board, click[0], click[1]);
        return board;
    }
    void dfs(char[][] board, int r, int c) {
        if (r<0||r>=board.length||c<0||c>=board[0].length||board[r][c]!='E') return;
        int mines = 0;
        for (int dr=-1;dr<=1;dr++) for (int dc=-1;dc<=1;dc++)
            if (!(dr==0&&dc==0)&&r+dr>=0&&r+dr<board.length&&c+dc>=0&&c+dc<board[0].length&&board[r+dr][c+dc]=='M') mines++;
        if (mines > 0) { board[r][c]=(char)('0'+mines); return; }
        board[r][c]='B';
        for (int dr=-1;dr<=1;dr++) for (int dc=-1;dc<=1;dc++) if (!(dr==0&&dc==0)) dfs(board,r+dr,c+dc);
    }
}
