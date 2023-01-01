
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m=mat.length;
        int[][] rank=new int[m][2];
        for(int i=0;i<m;i++){
            int cnt=0; for(int v:mat[i]) cnt+=v;
            rank[i]=new int[]{cnt,i};
        }
        Arrays.sort(rank,(a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        int[] res=new int[k];
        for(int i=0;i<k;i++) res[i]=rank[i][1];
        return res;
    }
}
