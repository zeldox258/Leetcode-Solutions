
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        for(int i=0;i<m;i++) sortDiag(mat,i,0,m,n);
        for(int j=1;j<n;j++) sortDiag(mat,0,j,m,n);
        return mat;
    }
    void sortDiag(int[][] mat,int r,int c,int m,int n){
        List<Integer> vals=new ArrayList<>();
        for(int i=r,j=c;i<m&&j<n;i++,j++) vals.add(mat[i][j]);
        Collections.sort(vals);
        int k=0;
        for(int i=r,j=c;i<m&&j<n;i++,j++) mat[i][j]=vals.get(k++);
    }
}
