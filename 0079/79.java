class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++) for(int j=0;j<board[0].length;j++) if(dfs(board,word,i,j,0)) return true;
        return false;
    }
    boolean dfs(char[][] b,String w,int i,int j,int idx){
        if(idx==w.length()) return true;
        if(i<0||i>=b.length||j<0||j>=b[0].length||b[i][j]!=w.charAt(idx)) return false;
        char tmp=b[i][j];b[i][j]='#';
        boolean found=dfs(b,w,i+1,j,idx+1)||dfs(b,w,i-1,j,idx+1)||dfs(b,w,i,j+1,idx+1)||dfs(b,w,i,j-1,idx+1);
        b[i][j]=tmp;return found;
    }
}