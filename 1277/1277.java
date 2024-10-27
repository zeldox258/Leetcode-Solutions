class Solution {
    public int countSquares(int[][] matrix) {
        int result = 0;
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j< matrix[0].length;j++){
                if(matrix[i][j]== 1){
                    result++;
                    boolean flag = true;
                    int carry = 2;
                    while(flag){
                        for(int x =0;x<carry;x++){
                            for(int y =0;y<carry;y++){
                                if(x+i >=matrix.length || y+j >=matrix[0].length || matrix[x+i][y+j] == 0){
                                    flag = false;
                                    x =carry;
                                    y =carry;
                                }
                            }
                        }
                        carry++;
                        if(flag) result++;
                    }
                }
            }
        }
        return result;
    }
}