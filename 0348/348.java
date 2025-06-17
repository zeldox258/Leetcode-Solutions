
class TicTacToe {
    int[] rows, cols; int diag, anti; int n;
    public TicTacToe(int n) { this.n=n; rows=new int[n]; cols=new int[n]; }
    public int move(int row, int col, int player) {
        int val=(player==1)?1:-1;
        rows[row]+=val; cols[col]+=val; if(row==col) diag+=val; if(row+col==n-1) anti+=val;
        if(Math.abs(rows[row])==n||Math.abs(cols[col])==n||Math.abs(diag)==n||Math.abs(anti)==n) return player;
        return 0;
    }
}
