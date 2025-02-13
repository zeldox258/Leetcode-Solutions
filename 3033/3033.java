class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int max=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==-1){
                    max=matrix[i][j];
                    int k=0;
                    while(k<matrix.length){
                        max=Math.max(max,matrix[k][j]);
                        k++;
                    }
                    matrix[i][j]=max;
                }
            }
        }
        return matrix;
    }
}