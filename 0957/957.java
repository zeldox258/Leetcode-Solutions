
class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        n=((n-1)%14)+1;
        for(int d=0;d<n;d++){int[]next=new int[8];for(int i=1;i<7;i++)next[i]=cells[i-1]==cells[i+1]?1:0;cells=next;}
        return cells;
    }
}
