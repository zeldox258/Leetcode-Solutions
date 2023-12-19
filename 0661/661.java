class Solution {
    public int[][] imageSmoother(int[][] M) {
        
        int[][] result = new int[M.length][M[0].length];
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[0].length;j++){
                result[i][j] = finder(M,i,j);
            }
        }
        return result;
    }
    public int finder(int[][] M , int x,int y){
        int result =0;
        int carry  =0;
        for(int i =x-1;i<=x+1;i++){
            for(int j = y-1;j<=y+1;j++){
                if(i>=0 && i<M.length && j>=0 && j<M[0].length){
                    result+= M[i][j];
                    carry++;
                }
            }
        }
        return result/carry;
    }
}