class Solution {
    public boolean isValidSudoku(char[][] board) {
        java.util.Set<String> seen = new java.util.HashSet<>();
        for(int i=0;i<9;i++) for(int j=0;j<9;j++){
            char c=board[i][j];
            if(c=='.') continue;
            if(!seen.add(c+" row "+i)||!seen.add(c+" col "+j)||!seen.add(c+" box "+i/3+"/"+j/3)) return false;
        }
        return true;
    }
}