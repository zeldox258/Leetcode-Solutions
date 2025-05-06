
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length,lo=matrix[0][0],hi=matrix[n-1][n-1];
        while(lo<hi){
            int mid=lo+(hi-lo)/2,cnt=0,j=n-1;
            for(int i=0;i<n;i++){while(j>=0&&matrix[i][j]>mid)j--;cnt+=j+1;}
            if(cnt<k) lo=mid+1; else hi=mid;
        }
        return lo;
    }
}
