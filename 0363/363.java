
import java.util.*;
class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m=matrix.length,n=matrix[0].length,res=Integer.MIN_VALUE;
        for(int l=0;l<n;l++){
            int[] rowSum=new int[m];
            for(int r=l;r<n;r++){
                for(int i=0;i<m;i++) rowSum[i]+=matrix[i][r];
                TreeSet<Integer> set=new TreeSet<>(); set.add(0); int cur=0;
                for(int s:rowSum){cur+=s;Integer ceil=set.ceiling(cur-k);if(ceil!=null)res=Math.max(res,cur-ceil);set.add(cur);}
            }
        }
        return res;
    }
}
