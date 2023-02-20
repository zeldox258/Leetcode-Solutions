
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row=new int[m],col=new int[n];
        for(int[] idx:indices){row[idx[0]]++;col[idx[1]]++;}
        int res=0;
        for(int i=0;i<m;i++) for(int j=0;j<n;j++) if((row[i]+col[j])%2==1) res++;
        return res;
    }
}
