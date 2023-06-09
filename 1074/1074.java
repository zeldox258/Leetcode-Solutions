
class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length,res=0;
        for(int i=0;i<m;i++)for(int j=1;j<n;j++)matrix[i][j]+=matrix[i][j-1];
        for(int l=0;l<n;l++)for(int r=l;r<n;r++){java.util.Map<Integer,Integer> map=new java.util.HashMap<>();map.put(0,1);int sum=0;for(int i=0;i<m;i++){sum+=matrix[i][r]-(l>0?matrix[i][l-1]:0);res+=map.getOrDefault(sum-target,0);map.merge(sum,1,Integer::sum);}}
        return res;
    }
}
