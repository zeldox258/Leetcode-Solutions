class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length,l=0,r=m*n-1;
        while(l<=r){int mid=(l+r)/2,val=matrix[mid/n][mid%n];if(val==target)return true;if(val<target)l=mid+1;else r=mid-1;}
        return false;
    }
}