import java.util.*;
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        int[] queens=new int[n];
        Arrays.fill(queens,-1);
        bt(res,queens,n,0,new boolean[n],new boolean[2*n],new boolean[2*n]);
        return res;
    }
    void bt(List<List<String>> res,int[] queens,int n,int row,boolean[] cols,boolean[] d1,boolean[] d2){
        if(row==n){List<String> b=new ArrayList<>();for(int i=0;i<n;i++){char[] r=new char[n];Arrays.fill(r,'.');r[queens[i]]='Q';b.add(new String(r));}res.add(b);return;}
        for(int col=0;col<n;col++){
            if(cols[col]||d1[row-col+n]||d2[row+col]) continue;
            queens[row]=col;cols[col]=d1[row-col+n]=d2[row+col]=true;
            bt(res,queens,n,row+1,cols,d1,d2);
            queens[row]=-1;cols[col]=d1[row-col+n]=d2[row+col]=false;
        }
    }
}