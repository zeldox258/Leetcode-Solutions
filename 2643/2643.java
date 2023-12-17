class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int count;
        int maxCount = 0;
        int maxCountRow = 0;
        for(int i = 0; i < mat.length; i++) {
            count = 0;
            for(int j = 0; j < mat[0].length; j++) {
                count += mat[i][j];
            }
            if(count > maxCount) {
                maxCount = count;
                maxCountRow = i;
            }
        }
        return new int[]{maxCountRow, maxCount};
    }
}